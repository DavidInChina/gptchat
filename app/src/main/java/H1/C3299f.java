package h1;

/* renamed from: h1.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3299f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f31720a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f31721b;

    /* renamed from: c  reason: collision with root package name */
    public int f31722c;

    public C3299f(int i10, int i11) {
        this.f31720a = i11;
        if (i11 != 1) {
            if (i10 > 0) {
                this.f31721b = new Object[i10];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else if (i10 > 0) {
            this.f31721b = new Object[i10];
        } else {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    public Object a() {
        int i10 = this.f31720a;
        Object[] objArr = this.f31721b;
        switch (i10) {
            case 0:
                int i11 = this.f31722c;
                if (i11 <= 0) {
                    return null;
                }
                int i12 = i11 - 1;
                Object obj = objArr[i12];
                objArr[i12] = null;
                this.f31722c = i12;
                return obj;
            default:
                int i13 = this.f31722c;
                if (i13 <= 0) {
                    return null;
                }
                int i14 = i13 - 1;
                Object obj2 = objArr[i14];
                objArr[i14] = null;
                this.f31722c = i14;
                return obj2;
        }
    }

    public boolean b(Object obj) {
        int i10 = this.f31720a;
        Object[] objArr = this.f31721b;
        switch (i10) {
            case 0:
                int i11 = this.f31722c;
                if (i11 >= objArr.length) {
                    return false;
                }
                objArr[i11] = obj;
                this.f31722c = i11 + 1;
                return true;
            default:
                int i12 = 0;
                while (true) {
                    int i13 = this.f31722c;
                    if (i12 < i13) {
                        if (objArr[i12] != obj) {
                            i12++;
                        } else {
                            throw new IllegalStateException("Already in the pool!");
                        }
                    } else if (i13 >= objArr.length) {
                        return false;
                    } else {
                        objArr[i13] = obj;
                        this.f31722c = i13 + 1;
                        return true;
                    }
                }
        }
    }
}
