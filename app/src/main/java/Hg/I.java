package Hg;

import Mf.AbstractC1013w;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class I extends q {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f7763c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7764d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public I(int i10, int i11) {
        super(r5.toString(), 1, 0);
        String str;
        this.f7763c = i11;
        if (i11 != 1) {
            StringBuilder q10 = android.gov.nist.core.a.q("must have at least ", i10, " value parameter");
            if (i10 > 1) {
                str = "s";
            } else {
                str = "";
            }
            q10.append(str);
            this.f7764d = i10;
            return;
        }
        super(AbstractC4194d.v("must have exactly ", i10, " value parameters"), 1, 0);
        this.f7764d = i10;
    }

    @Override // Hg.AbstractC0732e
    public final boolean a(AbstractC1013w abstractC1013w) {
        int i10 = this.f7763c;
        int i11 = this.f7764d;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("functionDescriptor", abstractC1013w);
                if (abstractC1013w.S().size() < i11) {
                    return false;
                }
                return true;
            default:
                AbstractC3557B.c0("functionDescriptor", abstractC1013w);
                if (abstractC1013w.S().size() != i11) {
                    return false;
                }
                return true;
        }
    }
}
