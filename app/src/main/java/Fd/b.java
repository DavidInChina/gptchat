package Fd;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5237Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ v f5238Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(v vVar, int i10) {
        super(0);
        this.f5237Y = i10;
        this.f5238Z = vVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        j jVar = j.f5249a;
        h hVar = h.f5247a;
        v vVar = this.f5238Z;
        int i10 = this.f5237Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        vVar.j(jVar);
                        break;
                    default:
                        vVar.j(hVar);
                        break;
                }
                return yVar;
            default:
                switch (i10) {
                    case 0:
                        vVar.j(jVar);
                        break;
                    default:
                        vVar.j(hVar);
                        break;
                }
                return yVar;
        }
    }
}
