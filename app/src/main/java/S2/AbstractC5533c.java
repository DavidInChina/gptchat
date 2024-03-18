package s2;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.opengl.GLES20;
import android.opengl.GLU;
import java.util.Locale;

/* renamed from: s2.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5533c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f45147a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f45148b = {"", "A", "B", TokenNames.f24310C};

    public static String a(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        char c10;
        Object[] objArr = new Object[5];
        objArr[0] = f45148b[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        if (z10) {
            c10 = 'H';
        } else {
            c10 = 'L';
        }
        objArr[3] = Character.valueOf(c10);
        objArr[4] = Integer.valueOf(i13);
        int i14 = AbstractC5530A.f45131a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static void b() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb2.append("glError: ");
            sb2.append(gluErrorString);
            z10 = true;
        }
        if (!z10) {
            return;
        }
        throw new Exception(sb2.toString());
    }

    public static void c(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new Exception(str);
    }
}
