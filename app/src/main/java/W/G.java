package W;

/* loaded from: classes.dex */
public final class G extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19145Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f19146Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(String str, int i10) {
        super(1);
        this.f19145Y = i10;
        this.f19146Z = str;
    }

    public final void a(L0.v vVar) {
        int i10 = this.f19145Y;
        String str = this.f19146Z;
        switch (i10) {
            case 0:
                Df.v[] vVarArr = L0.t.f10472a;
                L0.u uVar = L0.r.f10449e;
                Df.v vVar2 = L0.t.f10472a[2];
                uVar.a(vVar, str);
                return;
            case 1:
                L0.t.d(vVar, str);
                return;
            case 2:
                L0.t.d(vVar, str);
                L0.t.e(vVar, 5);
                return;
            case 3:
                Df.v[] vVarArr2 = L0.t.f10472a;
                L0.u uVar2 = L0.r.f10449e;
                Df.v vVar3 = L0.t.f10472a[2];
                uVar2.a(vVar, str);
                return;
            default:
                Df.v[] vVarArr3 = L0.t.f10472a;
                ((L0.j) vVar).y(L0.r.f10443E, str);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f19145Y) {
            case 0:
                a((L0.v) obj);
                return yVar;
            case 1:
                a((L0.v) obj);
                return yVar;
            case 2:
                a((L0.v) obj);
                return yVar;
            case 3:
                a((L0.v) obj);
                return yVar;
            default:
                a((L0.v) obj);
                return yVar;
        }
    }
}
