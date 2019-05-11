package types;

import asg.cliche.InputConverter;

public enum TypeEnum {
	LOAD,
	SOURCE,
	STORAGE,
	SMART_METER,
	LEGACY_METER,
	PCC;

	public static boolean contain(String name)
	{
		Object[] vs = values();
		for(Object ce : vs)
		{
			if(ce.toString().equals(name))
				return true;
		}
		return false;
	}
	
	public static InputConverter getCliConverter()
	{
		return new InputConverter() {
			
			public Object convertInput(String input, Class toClass) throws Exception {
				if(toClass.equals(TypeEnum.class))
				{
					return valueOf(input);
				}
				return null;
			}
		};
	}
}
