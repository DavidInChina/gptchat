package ti;

import wi.s;
import wi.z;

/* loaded from: classes2.dex */
public final class b extends yi.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f46240a;

    /* renamed from: b  reason: collision with root package name */
    public final wi.a f46241b;

    /* JADX WARN: Type inference failed for: r2v1, types: [wi.s, wi.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [wi.s, wi.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [wi.s, wi.a] */
    public b(int i10) {
        this.f46240a = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                this.f46241b = new s();
                return;
            } else {
                this.f46241b = new s();
                return;
            }
        }
        this.f46241b = new s();
    }

    public static boolean j(yi.d dVar, int i10) {
        CharSequence charSequence = ((f) dVar).f46257a.f50076a;
        if (((f) dVar).f46264h < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>') {
            return true;
        }
        return false;
    }

    @Override // yi.a
    public final boolean c(wi.a aVar) {
        switch (this.f46240a) {
            case 0:
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // yi.a
    public final wi.a f() {
        int i10 = this.f46240a;
        wi.a aVar = this.f46241b;
        switch (i10) {
            case 0:
                return (wi.b) aVar;
            case 1:
                return (wi.f) aVar;
            default:
                return (z) aVar;
        }
    }

    @Override // yi.a
    public final boolean g() {
        switch (this.f46240a) {
            case 0:
            case 1:
                return true;
            default:
                return this instanceof o;
        }
    }

    @Override // yi.a
    public final a i(yi.d dVar) {
        char charAt;
        switch (this.f46240a) {
            case 0:
                int i10 = ((f) dVar).f46262f;
                if (!j(dVar, i10)) {
                    return null;
                }
                f fVar = (f) dVar;
                int i11 = fVar.f46260d + fVar.f46264h;
                int i12 = i11 + 1;
                CharSequence charSequence = fVar.f46257a.f50076a;
                int i13 = i10 + 1;
                if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
                    i12 = i11 + 2;
                }
                return new a(-1, i12, false);
            case 1:
                return a.a(((f) dVar).f46259c);
            default:
                return null;
        }
    }

    @Override // yi.a
    public final void a(xi.d dVar) {
    }
}
