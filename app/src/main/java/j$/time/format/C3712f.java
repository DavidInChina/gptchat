package j$.time.format;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.f  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3712f implements AbstractC3713g {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC3713g[] f35010a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f35011b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3712f(ArrayList arrayList, boolean z10) {
        this((AbstractC3713g[]) arrayList.toArray(new AbstractC3713g[arrayList.size()]), z10);
    }

    C3712f(AbstractC3713g[] abstractC3713gArr, boolean z10) {
        this.f35010a = abstractC3713gArr;
        this.f35011b = z10;
    }

    public final C3712f a() {
        return !this.f35011b ? this : new C3712f(this.f35010a, false);
    }

    @Override // j$.time.format.AbstractC3713g
    public final boolean g(A a5, StringBuilder sb2) {
        int length = sb2.length();
        boolean z10 = this.f35011b;
        if (z10) {
            a5.g();
        }
        try {
            for (AbstractC3713g abstractC3713g : this.f35010a) {
                if (!abstractC3713g.g(a5, sb2)) {
                    sb2.setLength(length);
                    return true;
                }
            }
            if (z10) {
                a5.a();
            }
            return true;
        } finally {
            if (z10) {
                a5.a();
            }
        }
    }

    @Override // j$.time.format.AbstractC3713g
    public final int p(y yVar, CharSequence charSequence, int i10) {
        boolean z10 = this.f35011b;
        AbstractC3713g[] abstractC3713gArr = this.f35010a;
        if (!z10) {
            for (AbstractC3713g abstractC3713g : abstractC3713gArr) {
                i10 = abstractC3713g.p(yVar, charSequence, i10);
                if (i10 < 0) {
                    break;
                }
            }
            return i10;
        }
        yVar.r();
        int i11 = i10;
        for (AbstractC3713g abstractC3713g2 : abstractC3713gArr) {
            i11 = abstractC3713g2.p(yVar, charSequence, i11);
            if (i11 < 0) {
                yVar.f(false);
                return i10;
            }
        }
        yVar.f(true);
        return i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        AbstractC3713g[] abstractC3713gArr = this.f35010a;
        if (abstractC3713gArr != null) {
            boolean z10 = this.f35011b;
            sb2.append(z10 ? "[" : Separators.LPAREN);
            for (AbstractC3713g abstractC3713g : abstractC3713gArr) {
                sb2.append(abstractC3713g);
            }
            sb2.append(z10 ? "]" : Separators.RPAREN);
        }
        return sb2.toString();
    }
}
