package ver2_lec05.collectionframework03.samplecode08.service.impl;

import ver2_lec05.collectionframework03.samplecode08.repository.impl.CallDataRepositoryImpl;
import ver2_lec05.collectionframework03.samplecode08.service.CallDataService;

public class CallDataServiceImpl implements CallDataService {

	CallDataRepositoryImpl callDataRepositoryImpl = null;
	
	public CallDataServiceImpl() {
		System.out.println("CallDataServiceImpl 기본생성자");
		callDataRepositoryImpl = CallDataRepositoryImpl.getInstance();
	}
	
	@Override
	public Object getNationData(String nationName) {
		return callDataRepositoryImpl.getNationData(nationName);
	}

	@Override
	public String getIndustryData(int paramIndex) {
		return callDataRepositoryImpl.getIndustryData(paramIndex);
	}

}
