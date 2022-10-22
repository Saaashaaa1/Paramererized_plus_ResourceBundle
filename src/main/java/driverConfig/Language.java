package driverConfig;

public enum Language {
        english("en-us/"),
        polski("pl-pl/"),
        italiano("it-it/");



        private String code;

        Language(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
}
