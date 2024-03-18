package j;

import K4.J;

/* renamed from: j.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3875e extends J {

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f35802n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ String f35803o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ P4.a f35804p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ h f35805q0;

    public C3875e(h hVar, String str, P4.a aVar, int i10) {
        this.f35802n0 = i10;
        this.f35805q0 = hVar;
        this.f35803o0 = str;
        this.f35804p0 = aVar;
    }

    @Override // K4.J
    public final void K(Object obj) {
        int i10 = this.f35802n0;
        P4.a aVar = this.f35804p0;
        String str = this.f35803o0;
        h hVar = this.f35805q0;
        switch (i10) {
            case 0:
                Integer num = (Integer) hVar.f35811b.get(str);
                if (num != null) {
                    hVar.f35813d.add(str);
                    try {
                        hVar.b(num.intValue(), aVar, obj);
                        return;
                    } catch (Exception e10) {
                        hVar.f35813d.remove(str);
                        throw e10;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                Integer num2 = (Integer) hVar.f35811b.get(str);
                if (num2 != null) {
                    hVar.f35813d.add(str);
                    try {
                        hVar.b(num2.intValue(), aVar, obj);
                        return;
                    } catch (Exception e11) {
                        hVar.f35813d.remove(str);
                        throw e11;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    @Override // K4.J
    public final void i0() {
        int i10 = this.f35802n0;
        String str = this.f35803o0;
        h hVar = this.f35805q0;
        switch (i10) {
            case 0:
                hVar.e(str);
                return;
            default:
                hVar.e(str);
                return;
        }
    }
}
