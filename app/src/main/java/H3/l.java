package H3;

import s1.C5527i;

/* loaded from: classes2.dex */
public abstract class l extends k {

    /* renamed from: a  reason: collision with root package name */
    public C5527i[] f7390a;

    /* renamed from: b  reason: collision with root package name */
    public String f7391b;

    /* renamed from: c  reason: collision with root package name */
    public int f7392c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7393d;

    public l() {
        this.f7390a = null;
        this.f7392c = 0;
    }

    public C5527i[] getPathData() {
        return this.f7390a;
    }

    public String getPathName() {
        return this.f7391b;
    }

    public void setPathData(C5527i[] c5527iArr) {
        if (!R4.b.P(this.f7390a, c5527iArr)) {
            this.f7390a = R4.b.o0(c5527iArr);
            return;
        }
        C5527i[] c5527iArr2 = this.f7390a;
        for (int i10 = 0; i10 < c5527iArr.length; i10++) {
            c5527iArr2[i10].f45111a = c5527iArr[i10].f45111a;
            int i11 = 0;
            while (true) {
                float[] fArr = c5527iArr[i10].f45112b;
                if (i11 < fArr.length) {
                    c5527iArr2[i10].f45112b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f7390a = null;
        this.f7392c = 0;
        this.f7391b = lVar.f7391b;
        this.f7393d = lVar.f7393d;
        this.f7390a = R4.b.o0(lVar.f7390a);
    }
}
