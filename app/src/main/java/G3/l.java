package G3;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class l extends t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f5927a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5928b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f5929c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5930d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f5931e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5932f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ n f5933g;

    public l(n nVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f5933g = nVar;
        this.f5927a = obj;
        this.f5928b = arrayList;
        this.f5931e = obj2;
        this.f5932f = arrayList2;
    }

    @Override // G3.t, G3.r
    public final void c(s sVar) {
        n nVar = this.f5933g;
        Object obj = this.f5927a;
        if (obj != null) {
            nVar.s(obj, this.f5928b, null);
        }
        Object obj2 = this.f5929c;
        if (obj2 != null) {
            nVar.s(obj2, this.f5930d, null);
        }
        Object obj3 = this.f5931e;
        if (obj3 != null) {
            nVar.s(obj3, this.f5932f, null);
        }
    }

    @Override // G3.r
    public final void d(s sVar) {
        sVar.w(this);
    }
}
