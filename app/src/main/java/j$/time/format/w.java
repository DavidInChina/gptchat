package j$.time.format;

import android.gov.nist.core.Separators;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class w extends v {

    /* renamed from: i  reason: collision with root package name */
    private static final ConcurrentHashMap f35057i = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final H f35058e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f35059f;

    /* renamed from: g  reason: collision with root package name */
    private final HashMap f35060g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private final HashMap f35061h = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(H h10, boolean z10) {
        super(r0, "ZoneText(" + h10 + Separators.RPAREN);
        j$.time.temporal.t k10 = j$.time.temporal.q.k();
        this.f35058e = (H) Objects.requireNonNull(h10, "textStyle");
        this.f35059f = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.time.format.v
    public final p a(y yVar) {
        p pVar;
        H h10 = H.NARROW;
        H h11 = this.f35058e;
        if (h11 == h10) {
            return super.a(yVar);
        }
        Locale i10 = yVar.i();
        boolean k10 = yVar.k();
        Set a5 = j$.time.zone.i.a();
        int size = a5.size();
        HashMap hashMap = k10 ? this.f35060g : this.f35061h;
        Map.Entry entry = (Map.Entry) hashMap.get(i10);
        if (entry == null || ((Integer) entry.getKey()).intValue() != size || (pVar = (p) ((SoftReference) entry.getValue()).get()) == null) {
            pVar = p.f(yVar);
            String[][] zoneStrings = DateFormatSymbols.getInstance(i10).getZoneStrings();
            int length = zoneStrings.length;
            int i11 = 0;
            while (true) {
                int i12 = 1;
                if (i11 >= length) {
                    break;
                }
                String[] strArr = zoneStrings[i11];
                String str = strArr[0];
                if (a5.contains(str)) {
                    pVar.a(str, str);
                    String a10 = I.a(str, i10);
                    if (h11 != H.FULL) {
                        i12 = 2;
                    }
                    while (i12 < strArr.length) {
                        pVar.a(strArr[i12], a10);
                        i12 += 2;
                    }
                }
                i11++;
            }
            hashMap.put(i10, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(pVar)));
        }
        return pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Map] */
    @Override // j$.time.format.v, j$.time.format.AbstractC3713g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(A a5, StringBuilder sb2) {
        StringBuilder sb3;
        ?? r12;
        H h10;
        String str;
        H h11;
        String[] strArr;
        ZoneId zoneId = (ZoneId) a5.f(j$.time.temporal.q.l());
        if (zoneId == null) {
            return false;
        }
        String id2 = zoneId.getId();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor d10 = a5.d();
            if (!this.f35059f) {
                if (d10.f(j$.time.temporal.a.INSTANT_SECONDS)) {
                    r12 = zoneId.getRules().h(Instant.O(d10));
                } else {
                    j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                    if (d10.f(aVar)) {
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                        if (d10.f(aVar2)) {
                            LocalDate ofEpochDay = LocalDate.ofEpochDay(d10.w(aVar));
                            j$.time.i W6 = j$.time.i.W(d10.w(aVar2));
                            ofEpochDay.getClass();
                            LocalDateTime V10 = LocalDateTime.V(ofEpochDay, W6);
                            if (zoneId.getRules().f(V10) == null) {
                                ZoneRules rules = zoneId.getRules();
                                ZonedDateTime o10 = V10.o(zoneId);
                                o10.getClass();
                                r12 = rules.h(Instant.ofEpochSecond(o10.N(), o10.b().S()));
                            }
                        }
                    }
                }
                Locale c10 = a5.c();
                h10 = H.NARROW;
                str = null;
                ConcurrentHashMap concurrentHashMap = null;
                h11 = this.f35058e;
                if (h11 != h10) {
                    ConcurrentHashMap concurrentHashMap2 = f35057i;
                    SoftReference softReference = (SoftReference) concurrentHashMap2.get(id2);
                    if (softReference != null) {
                        ?? r52 = (Map) softReference.get();
                        concurrentHashMap = r52;
                        if (r52 != 0) {
                            strArr = (String[]) r52.get(c10);
                            concurrentHashMap = r52;
                        }
                    }
                    ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
                    TimeZone timeZone = TimeZone.getTimeZone(id2);
                    strArr = new String[]{id2, timeZone.getDisplayName(false, 1, c10), timeZone.getDisplayName(false, 0, c10), timeZone.getDisplayName(true, 1, c10), timeZone.getDisplayName(true, 0, c10), id2, id2};
                    if (concurrentHashMap3 == null) {
                        concurrentHashMap3 = new ConcurrentHashMap();
                    }
                    concurrentHashMap3.put(c10, strArr);
                    concurrentHashMap2.put(id2, new SoftReference(concurrentHashMap3));
                    str = r12 != 0 ? r12 != 1 ? strArr[h11.g() + 5] : strArr[h11.g() + 3] : strArr[h11.g() + 1];
                }
                if (str != null) {
                    sb3 = sb2;
                    id2 = str;
                    sb3.append(id2);
                    return true;
                }
            }
            r12 = 2;
            Locale c102 = a5.c();
            h10 = H.NARROW;
            str = null;
            ConcurrentHashMap concurrentHashMap4 = null;
            h11 = this.f35058e;
            if (h11 != h10) {
            }
            if (str != null) {
            }
        }
        sb3 = sb2;
        sb3.append(id2);
        return true;
    }
}
