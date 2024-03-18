package Z;

/* renamed from: Z.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1731q implements K {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22679a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f22680b;

    public /* synthetic */ C1731q(int i10, Object obj) {
        this.f22679a = i10;
        this.f22680b = obj;
    }

    public final void a() {
        int i10 = this.f22679a;
        Object obj = this.f22680b;
        switch (i10) {
            case 0:
                r rVar = (r) obj;
                rVar.f22721z--;
                return;
            default:
                j0.z zVar = (j0.z) obj;
                zVar.f35951j--;
                return;
        }
    }

    public final void b() {
        int i10 = this.f22679a;
        Object obj = this.f22680b;
        switch (i10) {
            case 0:
                ((r) obj).f22721z++;
                return;
            default:
                ((j0.z) obj).f35951j++;
                return;
        }
    }
}
