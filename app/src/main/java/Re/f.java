package Re;

import ce.AbstractC2397c;

/* loaded from: classes2.dex */
public final class f implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15469a;

    /* renamed from: b  reason: collision with root package name */
    public final e f15470b;

    public /* synthetic */ f(e eVar, int i10) {
        this.f15469a = i10;
        this.f15470b = eVar;
    }

    @Override // p000if.a
    public final Object get() {
        boolean z10;
        int i10 = this.f15469a;
        e eVar = this.f15470b;
        switch (i10) {
            case 0:
                Pe.a aVar = eVar.f15468a.f13964d;
                if (aVar == null) {
                    return null;
                }
                return aVar.f13948c;
            case 1:
                Pe.a aVar2 = eVar.f15468a.f13964d;
                if (aVar2 == null) {
                    return null;
                }
                return aVar2.f13947b;
            case 2:
                Pe.a aVar3 = eVar.f15468a.f13964d;
                if (aVar3 == null) {
                    return null;
                }
                return aVar3.f13946a;
            case 3:
                Pe.a aVar4 = eVar.f15468a.f13964d;
                if (aVar4 != null) {
                    z10 = aVar4.f13950e;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 4:
                return eVar.f15468a.f13965e;
            case 5:
                return eVar.f15468a.f13961a;
            case 6:
                return eVar.f15468a.f13963c;
            default:
                return eVar.f15468a.f13962b;
        }
    }
}
