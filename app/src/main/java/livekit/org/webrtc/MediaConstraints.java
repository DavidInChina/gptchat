package livekit.org.webrtc;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MediaConstraints {
    public final List<KeyValuePair> mandatory = new ArrayList();
    public final List<KeyValuePair> optional = new ArrayList();

    /* loaded from: classes2.dex */
    public static class KeyValuePair {
        private final String key;
        private final String value;

        public KeyValuePair(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            KeyValuePair keyValuePair = (KeyValuePair) obj;
            if (this.key.equals(keyValuePair.key) && this.value.equals(keyValuePair.value)) {
                return true;
            }
            return false;
        }

        @CalledByNative("KeyValuePair")
        public String getKey() {
            return this.key;
        }

        @CalledByNative("KeyValuePair")
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + this.key.hashCode();
        }

        public String toString() {
            return android.gov.nist.core.a.j(this.key, ": ", this.value);
        }
    }

    private static String stringifyKeyValuePairList(List<KeyValuePair> list) {
        StringBuilder sb2 = new StringBuilder("[");
        for (KeyValuePair keyValuePair : list) {
            if (sb2.length() > 1) {
                sb2.append(", ");
            }
            sb2.append(keyValuePair.toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    @CalledByNative
    public List<KeyValuePair> getMandatory() {
        return this.mandatory;
    }

    @CalledByNative
    public List<KeyValuePair> getOptional() {
        return this.optional;
    }

    public String toString() {
        return android.gov.nist.core.a.k("mandatory: ", stringifyKeyValuePairList(this.mandatory), ", optional: ", stringifyKeyValuePairList(this.optional));
    }
}
