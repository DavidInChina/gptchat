package N;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import h1.C3302i;
import id.AbstractC3557B;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b0 implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12286Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f12287Z;

    public /* synthetic */ b0(int i10, Object obj) {
        this.f12286Y = i10;
        this.f12287Z = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f12286Y;
        Object obj3 = null;
        Object obj4 = this.f12287Z;
        switch (i10) {
            case 0:
                Map map = (Map) obj4;
                return r.f.n((Comparable) map.get(Long.valueOf(((Number) obj).longValue())), (Comparable) map.get(Long.valueOf(((Number) obj2).longValue())));
            case 1:
                int compare = ((Comparator) obj4).compare(obj, obj2);
                if (compare == 0) {
                    return r.f.n(Integer.valueOf(((L0.o) obj).f10424g), Integer.valueOf(((L0.o) obj2).f10424g));
                }
                return compare;
            case 2:
                return ((C3302i) obj).f31730b - ((C3302i) obj2).f31730b;
            case 3:
                C1.c cVar = (C1.c) obj2;
                ((C1.c) obj).getClass();
                throw null;
            case 4:
                AbstractC2469q0.p(obj);
                AbstractC2469q0.p(obj2);
                throw null;
            case 5:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.f27084v0).compareTo(Boolean.valueOf(materialButton2.f27084v0));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj4;
                        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
                    }
                    return compareTo2;
                }
                return compareTo;
            case 6:
                Wd.h hVar = (Wd.h) obj;
                Wd.h hVar2 = (Wd.h) obj2;
                if (hVar != null || hVar2 != null) {
                    if (hVar != null) {
                        if (hVar2 == null) {
                            return 1;
                        }
                        Class<?> cls = hVar.getClass();
                        Class<?> cls2 = hVar2.getClass();
                        if (!AbstractC3557B.K(cls, cls2)) {
                            for (Object obj5 : (List) obj4) {
                                Class cls3 = (Class) obj5;
                                if (AbstractC3557B.K(cls3, cls) || AbstractC3557B.K(cls3, cls2)) {
                                    obj3 = obj5;
                                    if (!AbstractC3557B.K((Class) obj3, cls)) {
                                        return 1;
                                    }
                                }
                                while (r0.hasNext()) {
                                }
                            }
                            if (!AbstractC3557B.K((Class) obj3, cls)) {
                            }
                        }
                    }
                    return -1;
                }
                return 0;
            case 7:
                wf.n nVar = (wf.n) obj4;
                Lg.i iVar = Gf.H.f6342Y;
                AbstractC3557B.c0("$tmp0", nVar);
                return ((Number) nVar.invoke(obj, obj2)).intValue();
            case 8:
                Bg.A a5 = (Bg.A) obj;
                wf.k kVar = (wf.k) obj4;
                AbstractC3557B.Z(a5);
                String obj6 = kVar.invoke(a5).toString();
                Bg.A a10 = (Bg.A) obj2;
                AbstractC3557B.Z(a10);
                return r.f.n(obj6, kVar.invoke(a10).toString());
            default:
                oh.l lVar = (oh.l) ((mh.w) obj4);
                return r.f.n(Boolean.valueOf(Ad.l.X(((lh.u) obj2).f38510c, lVar.f41429e)), Boolean.valueOf(Ad.l.X(((lh.u) obj).f38510c, lVar.f41429e)));
        }
    }

    public b0(List list) {
        this.f12286Y = 6;
        AbstractC3557B.c0("order", list);
        this.f12287Z = list;
    }
}
