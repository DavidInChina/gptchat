package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private DateTimeFormatter f35072a;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f35075d;

    /* renamed from: b  reason: collision with root package name */
    private boolean f35073b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f35074c = true;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList f35076e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f35075d = arrayList;
        this.f35072a = dateTimeFormatter;
        arrayList.add(new E());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(char c10, char c11) {
        return c10 == c11 || Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
    }

    private E e() {
        ArrayList arrayList = this.f35075d;
        return (E) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(q qVar) {
        if (this.f35076e == null) {
            this.f35076e = new ArrayList();
        }
        this.f35076e.add(qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(char c10, char c11) {
        return this.f35073b ? c10 == c11 : c(c10, c11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final y d() {
        y yVar = new y(this.f35072a);
        yVar.f35073b = this.f35073b;
        yVar.f35074c = this.f35074c;
        return yVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(boolean z10) {
        ArrayList arrayList = this.f35075d;
        arrayList.remove(z10 ? arrayList.size() - 2 : arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final D g() {
        return this.f35072a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.chrono.k h() {
        j$.time.chrono.k kVar = e().f34990c;
        if (kVar == null) {
            j$.time.chrono.k a5 = this.f35072a.a();
            return a5 == null ? j$.time.chrono.r.f34946d : a5;
        }
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale i() {
        return this.f35072a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long j(j$.time.temporal.a aVar) {
        return (Long) e().f34988a.get(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.f35073b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return this.f35074c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z10) {
        this.f35073b = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        e().f34989b = zoneId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int o(j$.time.temporal.r rVar, long j6, int i10, int i11) {
        Objects.requireNonNull(rVar, "field");
        Long l10 = (Long) e().f34988a.put(rVar, Long.valueOf(j6));
        return (l10 == null || l10.longValue() == j6) ? i11 : ~i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        e().getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(boolean z10) {
        this.f35074c = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        ArrayList arrayList = this.f35075d;
        E e10 = e();
        e10.getClass();
        E e11 = new E();
        e11.f34988a.putAll(e10.f34988a);
        e11.f34989b = e10.f34989b;
        e11.f34990c = e10.f34990c;
        arrayList.add(e11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        if (i10 + i12 > charSequence.length() || i11 + i12 > charSequence2.length()) {
            return false;
        }
        if (this.f35073b) {
            for (int i13 = 0; i13 < i12; i13++) {
                if (charSequence.charAt(i10 + i13) != charSequence2.charAt(i11 + i13)) {
                    return false;
                }
            }
            return true;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            char charAt = charSequence.charAt(i10 + i14);
            char charAt2 = charSequence2.charAt(i11 + i14);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TemporalAccessor t(F f6, Set set) {
        E e10 = e();
        e10.f34990c = h();
        ZoneId zoneId = e10.f34989b;
        if (zoneId == null) {
            zoneId = this.f35072a.d();
        }
        e10.f34989b = zoneId;
        e10.i(f6, set);
        return e10;
    }

    public final String toString() {
        return e().toString();
    }
}
