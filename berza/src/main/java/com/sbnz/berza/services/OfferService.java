package com.sbnz.berza.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.MyOfferDTO;
import com.sbnz.berza.DTO.OfferDTO;
import com.sbnz.berza.DTO.OfferReport;
import com.sbnz.berza.DTO.UserDTO;
import com.sbnz.berza.interfaces.converters.OfferConverterInterface;
import com.sbnz.berza.interfaces.converters.UserConverterInterface;
import com.sbnz.berza.interfaces.services.OfferServiceInterface;
import com.sbnz.berza.model.Buyer;
import com.sbnz.berza.model.Offer;
import com.sbnz.berza.model.Product;
import com.sbnz.berza.repository.BuyerRepository;
import com.sbnz.berza.repository.OfferRepository;
import com.sbnz.berza.repository.ProductQualityParamRepository;
import com.sbnz.berza.repository.ProductRepository;
import com.sbnz.berza.repository.SaleRepository;


@Service
@Transactional
public class OfferService implements OfferServiceInterface {
	
	@Autowired
	private OfferRepository offerRepo;
	
	@Autowired
	private OfferConverterInterface converter;

	@Autowired
	private UserConverterInterface userConverter;

	@Autowired
	private BuyerRepository buyerRepo;

	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private ProductQualityParamRepository pqpRepo;

	@Autowired
	private SaleRepository saleRepo;
	
	
	@Override
	public OfferDTO Create(OfferDTO dto) {
		
		try {
			
			Offer entity = converter.DtoToEntity(dto);
			offerRepo.save(entity);
			return dto;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public OfferDTO Read(long id) {
		
		try {
			return converter.entityToDto(offerRepo.getOne(id));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<OfferDTO> ReadAll() {
		
		ArrayList<OfferDTO> list = new ArrayList<OfferDTO>();
		
		try {
				for(Offer entity : offerRepo.findAll())
			{
				list.add(converter.entityToDto(entity));
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		return list;
	}

	@Override
	public OfferDTO Update(OfferDTO dto) {
		Offer entity = offerRepo.getOne(dto.getOfferID());
		
		try {
			
			if(entity != null)
			{
				entity.setProduct(productRepo.getOne(dto.getProductID()));
				entity.setOfferActive(dto.isOfferAcctive());
				offerRepo.save(entity);
			}
			
			return dto;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public OfferDTO Delete(long id) {
		
		Offer entity = offerRepo.getOne(id);
		
		
		if (entity == null) {
			throw new IllegalArgumentException("Tried to delete non-existing entity");
		}

		offerRepo.delete(entity);

		return converter.entityToDto(entity);
	}

	@Override
	public List<MyOfferDTO> getOffer(UserDTO u) {
		
		ArrayList<MyOfferDTO> list = new ArrayList<MyOfferDTO>();
		
		try {
			
			for(Offer entity : offerRepo.getOfferByUser(userConverter.DtoToEntity(u)))
			{
				MyOfferDTO tmp = new MyOfferDTO();
				tmp.setDate(entity.getOfferDate());
				tmp.setOfferID(entity.getOfferId());
				tmp.setProduct(entity.getProduct().getProductName());
				Buyer buyer = entity.getBuyer();
				tmp.setBuyer(buyer.getBuyerName() + " " + buyer.getBuyerSurname());
				list.add(tmp);
			}
			
			return list;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean boughtZitarice(long buyer) {
		
		ArrayList<Offer> ponude = (ArrayList<Offer>) offerRepo.getOfferByBuyer(buyerRepo.getOne(buyer));
		Product zitarice = productRepo.getProductByProductCode("ZITARICE");
		if(ponude.size() > 0)
		{
			for(Offer off : ponude)
			{
				if(off.getProduct().getProductId() == zitarice.getProductId())
				{
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean boughtKomponenteStocneHrane(long buyer) {
		
		ArrayList<Offer> ponude = (ArrayList<Offer>) offerRepo.getOfferByBuyer(buyerRepo.getOne(buyer));
		Product ksh = productRepo.getProductByProductCode("KSH");
		if(ponude.size() > 0)
		{
			for(Offer off : ponude)
			{
				if(off.getProduct().getProductId() == ksh.getProductId())
				{
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean boughtSemenskaRoba(long buyer) {
		
		ArrayList<Offer> ponude = (ArrayList<Offer>) offerRepo.getOfferByBuyer(buyerRepo.getOne(buyer));
		Product sr = productRepo.getProductByProductCode("SR");
		if(ponude.size() > 0)
		{
			for(Offer off : ponude)
			{
				if(off.getProduct().getProductId() == sr.getProductId())
				{
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean boughtMineralnaDjubriva(long buyer) {
		
		ArrayList<Offer> ponude = (ArrayList<Offer>) offerRepo.getOfferByBuyer(buyerRepo.getOne(buyer));
		Product mdj = productRepo.getProductByProductCode("MDJ");
		if(ponude.size() > 0)
		{
			for(Offer off : ponude)
			{
				if(off.getProduct().getProductId() == mdj.getProductId())
				{
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean boughtIndustrijskoBilje(long buyer) {
		
		ArrayList<Offer> ponude = (ArrayList<Offer>) offerRepo.getOfferByBuyer(buyerRepo.getOne(buyer));
		Product ib = productRepo.getProductByProductCode("IB");
		if(ponude.size() > 0)
		{
			for(Offer off : ponude)
			{
				if(off.getProduct().getProductId() == ib.getProductId())
				{
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public List<OfferReport> getOfferReport() {
		
		ArrayList<OfferReport> list = new ArrayList<OfferReport>();
		
		try {
			for(Offer entity : offerRepo.findAll())
			{
				list.add(new OfferReport(entity));
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		return list;
	}

}
