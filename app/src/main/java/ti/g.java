package ti;

import K4.J;
import wi.s;

/* loaded from: classes2.dex */
public final class g extends yi.a {

    /* renamed from: a  reason: collision with root package name */
    public final wi.h f46274a;

    /* renamed from: b  reason: collision with root package name */
    public String f46275b;

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f46276c = new StringBuilder();

    /* JADX WARN: Type inference failed for: r0v0, types: [wi.s, wi.h] */
    public g(char c10, int i10, int i11) {
        ?? sVar = new s();
        this.f46274a = sVar;
        sVar.f48592g = c10;
        sVar.f48593h = i10;
        sVar.f48594i = i11;
    }

    @Override // yi.a
    public final void a(xi.d dVar) {
        String str = this.f46275b;
        CharSequence charSequence = dVar.f50076a;
        if (str == null) {
            this.f46275b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f46276c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // yi.a
    public final void e() {
        String b10 = vi.a.b(this.f46275b.trim());
        wi.h hVar = this.f46274a;
        hVar.f48595j = b10;
        hVar.f48596k = this.f46276c.toString();
    }

    @Override // yi.a
    public final wi.a f() {
        return this.f46274a;
    }

    @Override // yi.a
    public final a i(yi.d dVar) {
        f fVar = (f) dVar;
        int i10 = fVar.f46262f;
        int i11 = fVar.f46259c;
        CharSequence charSequence = fVar.f46257a.f50076a;
        int i12 = fVar.f46264h;
        wi.h hVar = this.f46274a;
        if (i12 < 4 && i10 < charSequence.length()) {
            char charAt = charSequence.charAt(i10);
            char c10 = hVar.f48592g;
            if (charAt == c10) {
                int i13 = hVar.f48593h;
                int length = charSequence.length();
                int i14 = i10;
                while (true) {
                    if (i14 >= length) {
                        break;
                    } else if (charSequence.charAt(i14) != c10) {
                        length = i14;
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = length - i10;
                if (i15 >= i13 && J.e0(i10 + i15, charSequence.length(), charSequence) == charSequence.length()) {
                    return new a(-1, -1, true);
                }
            }
        }
        int length2 = charSequence.length();
        for (int i16 = hVar.f48594i; i16 > 0 && i11 < length2 && charSequence.charAt(i11) == ' '; i16--) {
            i11++;
        }
        return a.a(i11);
    }
}
