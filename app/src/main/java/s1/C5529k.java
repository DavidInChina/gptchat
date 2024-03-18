package s1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.google.android.gms.internal.play_billing.N;
import io.sentry.android.core.AbstractC3612c;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r9.y;
import z1.C6749h;

/* renamed from: s1.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5529k extends J0.a {

    /* renamed from: Z  reason: collision with root package name */
    public static Class f45115Z;

    /* renamed from: h0  reason: collision with root package name */
    public static Constructor f45116h0;

    /* renamed from: i0  reason: collision with root package name */
    public static Method f45117i0;

    /* renamed from: j0  reason: collision with root package name */
    public static Method f45118j0;

    /* renamed from: k0  reason: collision with root package name */
    public static boolean f45119k0;

    public C5529k() {
        super(9);
    }

    public static boolean k0(String str, boolean z10, int i10, Object obj) {
        l0();
        try {
            return ((Boolean) f45117i0.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void l0() {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        Method method2;
        if (f45119k0) {
            return;
        }
        f45119k0 = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            AbstractC3612c.d("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            cls = null;
            method2 = null;
            constructor = null;
            method = null;
        }
        f45116h0 = constructor;
        f45115Z = cls;
        f45117i0 = method;
        f45118j0 = method2;
    }

    @Override // J0.a
    public Typeface F(Context context, r1.f fVar, Resources resources, int i10) {
        r1.g[] gVarArr;
        l0();
        try {
            Object newInstance = f45116h0.newInstance(new Object[0]);
            for (r1.g gVar : fVar.f44284a) {
                File x02 = y.x0(context);
                if (x02 == null) {
                    return null;
                }
                try {
                    if (!y.d0(x02, resources, gVar.f44290f)) {
                        return null;
                    }
                    if (!k0(x02.getPath(), gVar.f44287c, gVar.f44286b, newInstance)) {
                        return null;
                    }
                    x02.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    x02.delete();
                }
            }
            l0();
            try {
                Object newInstance2 = Array.newInstance(f45115Z, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f45118j0.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // J0.a
    public Typeface G(Context context, C6749h[] c6749hArr, int i10) {
        File file;
        io.sentry.instrumentation.file.d u10;
        String readlink;
        if (c6749hArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(K(i10, c6749hArr).f51453a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null && file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                    u10 = N.u(new FileInputStream(fileDescriptor), fileDescriptor);
                    Typeface H6 = H(context, u10);
                    u10.close();
                    openFileDescriptor.close();
                    return H6;
                }
                Typeface H62 = H(context, u10);
                u10.close();
                openFileDescriptor.close();
                return H62;
            } catch (Throwable th2) {
                try {
                    u10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileDescriptor fileDescriptor2 = openFileDescriptor.getFileDescriptor();
            u10 = N.u(new FileInputStream(fileDescriptor2), fileDescriptor2);
        } catch (IOException unused2) {
            return null;
        }
    }
}
