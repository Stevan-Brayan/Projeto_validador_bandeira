import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

class ValidadorCartao {
    private static final Map<String, String> BANDEIRAS = new LinkedHashMap<>();

    static {
        BANDEIRAS.put("Visa", "^4.*");
        BANDEIRAS.put("MasterCard", "^5[1-5].*|^2(2[2-9][1-9]|2[3-9][0-9]|[3-6][0-9]{2}|7[0-1][0-9]|720).*");
        BANDEIRAS.put("Elo", "^(4011|4312|4389).*");
        BANDEIRAS.put("American Express", "^3[47].*");
        BANDEIRAS.put("Discover", "^6011.*|^65.*|^64[4-9].*");
        BANDEIRAS.put("Hipercard", "^6062.*");
        BANDEIRAS.put("Diners Club", "^3[068].*");
        BANDEIRAS.put("JCB", "^35.*");
        BANDEIRAS.put("Voyager", "^8699.*");
        BANDEIRAS.put("Aura", "^50.*");
        BANDEIRAS.put("EnRoute", "^2014.*|^2149.*");
    }

    public String validarBandeira(String numeroCartao) {
        for (Map.Entry<String, String> entry : BANDEIRAS.entrySet()) {
            if (Pattern.matches(entry.getValue(), numeroCartao)) {
                return entry.getKey();
            }
        }
        return "Bandeira desconhecida";
    }
}
