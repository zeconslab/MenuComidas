package mx.edu.itsz.menudecomidas.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Helper class for providing sample Nombre for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Comida> ITEMS = new ArrayList<Comida>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Comida> ITEM_MAP = new HashMap<String, Comida>();

    private static final int COUNT = 0;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(Comida item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static Comida createDummyItem(int position) {
        return new Comida(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of Nombre.
     */
    public static class Comida {
        private  String id;
        private  String Nombre;
        private  String Precio;

        public Comida(String nombre, String precio) {
            Nombre = nombre;
            Precio = precio;
        }

        public Comida(String id, String Nombre, String Precio) {
            this.id = id;
            this.Nombre = Nombre;
            this.Precio = Precio;
        }

        @Override
        public String toString() {
            return Nombre;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }

        public String getPrecio() {
            return Precio;
        }

        public void setPrecio(String precio) {
            Precio = precio;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Comida comida = (Comida) o;
            return Objects.equals(id, comida.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
