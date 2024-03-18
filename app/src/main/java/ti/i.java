package ti;

import java.util.ArrayList;
import java.util.List;
import wi.s;

/* loaded from: classes2.dex */
public final class i extends yi.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f46278a;

    /* renamed from: b  reason: collision with root package name */
    public final wi.a f46279b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f46280c;

    /* JADX WARN: Type inference failed for: r0v1, types: [wi.s, wi.a] */
    public i() {
        this.f46278a = 1;
        this.f46279b = new s();
        this.f46280c = new ArrayList();
    }

    @Override // yi.a
    public final void a(xi.d dVar) {
        switch (this.f46278a) {
            case 1:
                ((List) this.f46280c).add(dVar.f50076a);
                return;
            default:
                return;
        }
    }

    @Override // yi.a
    public final void e() {
        int i10;
        switch (this.f46278a) {
            case 1:
                List list = (List) this.f46280c;
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) list.get(size);
                        int length = charSequence.length();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                break;
                            }
                            char charAt = charSequence.charAt(i11);
                            if (charAt != ' ') {
                                switch (charAt) {
                                    case '\t':
                                    case '\n':
                                    case 11:
                                    case '\f':
                                    case '\r':
                                        break;
                                    default:
                                        if (i11 == -1) {
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                            i11++;
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                for (i10 = 0; i10 < size + 1; i10++) {
                    sb2.append((CharSequence) list.get(i10));
                    sb2.append('\n');
                }
                ((wi.n) this.f46279b).f48602g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override // yi.a
    public final wi.a f() {
        int i10 = this.f46278a;
        wi.a aVar = this.f46279b;
        switch (i10) {
            case 0:
                return (wi.j) aVar;
            default:
                return (wi.n) aVar;
        }
    }

    @Override // yi.a
    public final void h(l lVar) {
        switch (this.f46278a) {
            case 0:
                lVar.e((Q3.j) this.f46280c, (wi.j) this.f46279b);
                return;
            default:
                return;
        }
    }

    @Override // yi.a
    public final a i(yi.d dVar) {
        switch (this.f46278a) {
            case 0:
                return null;
            default:
                f fVar = (f) dVar;
                if (fVar.f46264h >= 4) {
                    return new a(-1, fVar.f46260d + 4, false);
                }
                if (!fVar.f46265i) {
                    return null;
                }
                return a.a(fVar.f46262f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [wi.s, wi.a, wi.j] */
    public i(int i10, Q3.j jVar) {
        this.f46278a = 0;
        ?? sVar = new s();
        this.f46279b = sVar;
        sVar.f48597g = i10;
        this.f46280c = jVar;
    }
}
