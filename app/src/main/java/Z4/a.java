package Z4;

import id.AbstractC3557B;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: classes2.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f23149a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f23150b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f23151c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23152d;

    /* renamed from: e  reason: collision with root package name */
    public final int f23153e;

    /* renamed from: f  reason: collision with root package name */
    public final int f23154f;

    /* renamed from: g  reason: collision with root package name */
    public final int f23155g;

    /* renamed from: h  reason: collision with root package name */
    public final int f23156h;

    /* renamed from: i  reason: collision with root package name */
    public final int f23157i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l f23158j;

    public a(l lVar, int i10, int i11) {
        AbstractC3557B.c0("this$0", lVar);
        this.f23158j = lVar;
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, i10, 12325, i11, 12326, 0, 12344};
        this.f23150b = lVar;
        int i12 = lVar.f23203z0;
        if (i12 == 2 || i12 == 3) {
            int[] iArr2 = new int[15];
            System.arraycopy(iArr, 0, iArr2, 0, 12);
            iArr2[12] = 12352;
            if (lVar.f23203z0 == 2) {
                iArr2[13] = 4;
            } else {
                iArr2[13] = 64;
            }
            iArr2[14] = 12344;
            iArr = iArr2;
        }
        this.f23149a = iArr;
        this.f23151c = new int[1];
        this.f23152d = 8;
        this.f23153e = 8;
        this.f23154f = 8;
        this.f23155g = i10;
        this.f23156h = i11;
        this.f23157i = 0;
    }

    public final int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        int[] iArr = this.f23151c;
        if (!egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, iArr)) {
            return 0;
        }
        return iArr[0];
    }
}
