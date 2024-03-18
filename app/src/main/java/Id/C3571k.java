package id;

import de.C2631f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import yf.AbstractC6583a;

/* renamed from: id.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3571k extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3571k f33102Z = new C3571k(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3571k f33103h0 = new C3571k(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3571k f33104i0 = new C3571k(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f33105Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3571k(int i10) {
        super(1);
        this.f33105Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f33105Y) {
            case 0:
                V6.b bVar = (V6.b) obj;
                AbstractC3557B.c0("$this$open", bVar);
                List<Map> p12 = Kg.m.p1(bVar.a());
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(p12, 10));
                for (Map map : p12) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        linkedHashMap.put(entry.getKey(), new C3565e((String) entry.getValue()));
                    }
                    arrayList.add(linkedHashMap);
                }
                return new x(arrayList, new u(kf.w.f37484Y), kf.v.f37483Y);
            case 1:
                ((Number) obj).intValue();
                return new Z0.e(32);
            default:
                return new C2631f(((Number) obj).intValue(), 0);
        }
    }
}
