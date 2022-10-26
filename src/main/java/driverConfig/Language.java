package driverConfig;

public enum Language {
        EN("en-us"),
        PL("pl-pl"),
        IT("it-it");



        private String code;

        Language(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }
}
