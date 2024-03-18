package j$.time;

import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public abstract class ZoneId implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f34886a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.l("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.l("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.l("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.l("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.l("AST", "America/Anchorage"), j$.com.android.tools.r8.a.l("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.l("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.l("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.l("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.l("CST", "America/Chicago"), j$.com.android.tools.r8.a.l("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.l("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.l("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.l("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.l("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.l("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.l("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.l("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.l("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.l("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.l("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.l("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.l("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.l("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.l("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.l("EST", "-05:00"), j$.com.android.tools.r8.a.l("MST", "-07:00"), j$.com.android.tools.r8.a.l("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        for (int i10 = 0; i10 < 28; i10++) {
            Map.Entry entry = entryArr[i10];
            Object requireNonNull = Objects.requireNonNull(entry.getKey());
            if (hashMap.put(requireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + requireNonNull);
            }
        }
        f34886a = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneId() {
        if (getClass() == ZoneOffset.class || getClass() == v.class) {
            return;
        }
        throw new AssertionError("Invalid subclass");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneId L(String str, boolean z10) {
        int i10;
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.of(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i10 = 3;
        } else if (!str.startsWith("UT")) {
            return v.R(str, z10);
        } else {
            i10 = 2;
        }
        return P(str, i10, z10);
    }

    public static ZoneId O(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.T() != 0) {
            str = str.concat(zoneOffset.getId());
        }
        return new v(str, ZoneRules.i(zoneOffset));
    }

    private static ZoneId P(String str, int i10, boolean z10) {
        String substring = str.substring(0, i10);
        if (str.length() == i10) {
            return O(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i10) != '+' && str.charAt(i10) != '-') {
            return v.R(str, z10);
        }
        try {
            ZoneOffset of2 = ZoneOffset.of(str.substring(i10));
            return of2 == ZoneOffset.UTC ? O(substring, of2) : O(substring, of2);
        } catch (DateTimeException e10) {
            throw new RuntimeException("Invalid ID for offset-based ZoneId: ".concat(str), e10);
        }
    }

    public static ZoneId of(String str) {
        return L(str, true);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZoneId systemDefault() {
        String id2 = TimeZone.getDefault().getID();
        Objects.requireNonNull(id2, "zoneId");
        Map map = f34886a;
        Objects.requireNonNull(map, "aliasMap");
        Object obj = (String) map.get(id2);
        if (obj == null) {
            obj = Objects.requireNonNull(id2, "defaultObj");
        }
        return of((String) obj);
    }

    private Object writeReplace() {
        return new q((byte) 7, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void Q(DataOutput dataOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneId)) {
            return false;
        }
        return getId().equals(((ZoneId) obj).getId());
    }

    public abstract String getId();

    public abstract ZoneRules getRules();

    public int hashCode() {
        return getId().hashCode();
    }

    public ZoneId normalized() {
        try {
            ZoneRules rules = getRules();
            if (rules.isFixedOffset()) {
                return rules.d(Instant.EPOCH);
            }
        } catch (j$.time.zone.f unused) {
        }
        return this;
    }

    public String toString() {
        return getId();
    }
}
