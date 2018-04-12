
 enum  enums {

	 FIRST
		{
			@Override
			void commonMethod()
			{
				System.out.println("Common method Overridden in FIRST");
			}
		},

		SECOND
		{
			@Override
			void commonMethod()
			{
				System.out.println("Common method Overridden in SECOND");
			}
		},

		THIRD
		{
			@Override
			void commonMethod()
			{
				System.out.println("Common method Overridden in THIRD");
			}
		};

		void commonMethod()
		{
			System.out.println("Generalized method, Common to all constants");
		}
}
