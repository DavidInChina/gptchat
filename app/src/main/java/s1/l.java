package s1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import io.sentry.android.core.AbstractC3612c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import r9.y;
import w.C6049A;
import z1.C6749h;

/* loaded from: classes2.dex */
public final class l extends J0.a {

    /* renamed from: Z  reason: collision with root package name */
    public static final Class f45120Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final Constructor f45121h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final Method f45122i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final Method f45123j0;

    static {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            AbstractC3612c.d("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method2 = null;
            constructor = null;
            method = null;
        }
        f45121h0 = constructor;
        f45120Z = cls;
        f45122i0 = method;
        f45123j0 = method2;
    }

    public static boolean k0(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f45122i0.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface l0(Object obj) {
        try {
            Object newInstance = Array.newInstance(f45120Z, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f45123j0.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0060 A[SYNTHETIC] */
    @Override // J0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface F(Context context, r1.f fVar, Resources resources, int i10) {
        Object obj;
        r1.g[] gVarArr;
        MappedByteBuffer mappedByteBuffer;
        io.sentry.instrumentation.file.d t10;
        try {
            obj = f45121h0.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (r1.g gVar : fVar.f44284a) {
            int i11 = gVar.f44290f;
            File x02 = y.x0(context);
            if (x02 != null) {
                try {
                    if (y.d0(x02, resources, i11)) {
                        try {
                            t10 = N.t(new FileInputStream(x02), x02);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = t10.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            t10.close();
                            if (mappedByteBuffer != null) {
                                return null;
                            }
                            if (!k0(obj, mappedByteBuffer, gVar.f44289e, gVar.f44286b, gVar.f44287c)) {
                                return null;
                            }
                        } finally {
                            break;
                        }
                    }
                } finally {
                    x02.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
            }
        }
        return l0(obj);
    }

    @Override // J0.a
    public final Typeface G(Context context, C6749h[] c6749hArr, int i10) {
        Object obj;
        try {
            obj = f45121h0.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C6049A c6049a = new C6049A(0);
        for (C6749h c6749h : c6749hArr) {
            Uri uri = c6749h.f51453a;
            ByteBuffer byteBuffer = (ByteBuffer) c6049a.get(uri);
            if (byteBuffer == null) {
                byteBuffer = y.M0(context, uri);
                c6049a.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!k0(obj, byteBuffer, c6749h.f51454b, c6749h.f51455c, c6749h.f51456d)) {
                return null;
            }
        }
        Typeface l02 = l0(obj);
        if (l02 == null) {
            return null;
        }
        return Typeface.create(l02, i10);
    }
}
