package xe;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import yf.AbstractC6583a;

/* renamed from: xe.P  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6411P implements AbstractC6402G {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6402G f49871a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f49872b;

    public C6411P(AbstractC6402G abstractC6402G) {
        AbstractC3557B.c0("encodedParametersBuilder", abstractC6402G);
        this.f49871a = abstractC6402G;
        this.f49872b = abstractC6402G.b();
    }

    @Override // Fe.w
    public final Set a() {
        return ((Fe.y) AbstractC3557B.x0(this.f49871a)).a();
    }

    @Override // Fe.w
    public final boolean b() {
        return this.f49872b;
    }

    @Override // Fe.w
    public final List c(String str) {
        AbstractC3557B.c0("name", str);
        List<String> c10 = this.f49871a.c(AbstractC6412a.f(str, false));
        if (c10 != null) {
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(c10, 10));
            for (String str2 : c10) {
                arrayList.add(AbstractC6412a.e(str2, 0, 0, true, 11));
            }
            return arrayList;
        }
        return null;
    }

    @Override // Fe.w
    public final void clear() {
        this.f49871a.clear();
    }

    @Override // Fe.w
    public final boolean d(String str) {
        AbstractC3557B.c0("name", str);
        return this.f49871a.d(AbstractC6412a.f(str, false));
    }

    @Override // Fe.w
    public final void e(String str, Iterable iterable) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, iterable);
        String f6 = AbstractC6412a.f(str, false);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            AbstractC3557B.c0("<this>", str2);
            arrayList.add(AbstractC6412a.f(str2, true));
        }
        this.f49871a.e(f6, arrayList);
    }

    @Override // Fe.w
    public final void f(String str, String str2) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("value", str2);
        this.f49871a.f(AbstractC6412a.f(str, false), AbstractC6412a.f(str2, true));
    }

    @Override // Fe.w
    public final boolean isEmpty() {
        return this.f49871a.isEmpty();
    }

    @Override // Fe.w
    public final Set names() {
        Set<String> names = this.f49871a.names();
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(names, 10));
        for (String str : names) {
            arrayList.add(AbstractC6412a.e(str, 0, 0, false, 15));
        }
        return kf.t.P2(arrayList);
    }
}
