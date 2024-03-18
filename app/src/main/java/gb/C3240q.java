package gb;

import id.AbstractC3557B;

/* renamed from: gb.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3240q extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31504Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ sb.x f31505Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ w9.j f31506h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3240q(sb.x xVar, w9.j jVar, int i10) {
        super(1);
        this.f31504Y = i10;
        this.f31505Z = xVar;
        this.f31506h0 = jVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        sb.x xVar = this.f31505Z;
        w9.j jVar = this.f31506h0;
        int i10 = this.f31504Y;
        switch (i10) {
            case 0:
                sb.t tVar = (sb.t) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("action", tVar);
                        xVar.j(tVar);
                        jVar.a();
                        break;
                    default:
                        AbstractC3557B.c0("action", tVar);
                        xVar.j(tVar);
                        jVar.a();
                        break;
                }
                return yVar;
            default:
                sb.t tVar2 = (sb.t) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("action", tVar2);
                        xVar.j(tVar2);
                        jVar.a();
                        break;
                    default:
                        AbstractC3557B.c0("action", tVar2);
                        xVar.j(tVar2);
                        jVar.a();
                        break;
                }
                return yVar;
        }
    }
}
