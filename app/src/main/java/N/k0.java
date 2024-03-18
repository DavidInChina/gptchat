package N;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class k0 implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12363Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f12364Z;

    public /* synthetic */ k0(wf.n nVar, int i10) {
        this.f12363Y = i10;
        this.f12364Z = nVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f12363Y;
        wf.n nVar = this.f12364Z;
        switch (i10) {
            case 0:
                return ((Number) nVar.invoke(obj, obj2)).intValue();
            default:
                int[] iArr = H0.O.f6796V0;
                return ((Number) nVar.invoke(obj, obj2)).intValue();
        }
    }
}
