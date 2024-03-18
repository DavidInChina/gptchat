package s1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import io.sentry.android.core.AbstractC3612c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r9.y;
import z1.C6749h;

/* loaded from: classes2.dex */
public class m extends C5529k {

    /* renamed from: l0  reason: collision with root package name */
    public final Class f45124l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Constructor f45125m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Method f45126n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Method f45127o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Method f45128p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Method f45129q0;

    /* renamed from: r0  reason: collision with root package name */
    public final Method f45130r0;

    public m() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Class<?> cls;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method4 = s0(cls);
            Class<?> cls2 = Integer.TYPE;
            method3 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method2 = cls.getMethod("freeze", new Class[0]);
            method5 = cls.getMethod("abortCreation", new Class[0]);
            method = t0(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            AbstractC3612c.d("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            cls = null;
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f45124l0 = cls;
        this.f45125m0 = constructor;
        this.f45126n0 = method4;
        this.f45127o0 = method3;
        this.f45128p0 = method2;
        this.f45129q0 = method5;
        this.f45130r0 = method;
    }

    public static Method s0(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // s1.C5529k, J0.a
    public final Typeface F(Context context, r1.f fVar, Resources resources, int i10) {
        r1.g[] gVarArr;
        if (!q0()) {
            return super.F(context, fVar, resources, i10);
        }
        Object r02 = r0();
        if (r02 == null) {
            return null;
        }
        for (r1.g gVar : fVar.f44284a) {
            if (!n0(context, r02, gVar.f44285a, gVar.f44289e, gVar.f44286b, gVar.f44287c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f44288d))) {
                m0(r02);
                return null;
            }
        }
        if (!p0(r02)) {
            return null;
        }
        return o0(r02);
    }

    @Override // s1.C5529k, J0.a
    public final Typeface G(Context context, C6749h[] c6749hArr, int i10) {
        Typeface o02;
        if (c6749hArr.length < 1) {
            return null;
        }
        if (!q0()) {
            C6749h K10 = K(i10, c6749hArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(K10.f51453a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(K10.f51455c).setItalic(K10.f51456d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (C6749h c6749h : c6749hArr) {
            if (c6749h.f51457e == 0) {
                Uri uri = c6749h.f51453a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, y.M0(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object r02 = r0();
        if (r02 == null) {
            return null;
        }
        int length = c6749hArr.length;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            C6749h c6749h2 = c6749hArr[i11];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c6749h2.f51453a);
            if (byteBuffer != null) {
                if (((Boolean) this.f45127o0.invoke(r02, byteBuffer, Integer.valueOf(c6749h2.f51454b), null, Integer.valueOf(c6749h2.f51455c), Integer.valueOf(c6749h2.f51456d ? 1 : 0))).booleanValue()) {
                    z10 = true;
                } else {
                    m0(r02);
                    return null;
                }
            }
            i11++;
            z10 = z10;
        }
        if (!z10) {
            m0(r02);
            return null;
        } else if (!p0(r02) || (o02 = o0(r02)) == null) {
            return null;
        } else {
            return Typeface.create(o02, i10);
        }
    }

    @Override // J0.a
    public final Typeface I(Context context, Resources resources, int i10, String str, int i11) {
        if (!q0()) {
            return super.I(context, resources, i10, str, i11);
        }
        Object r02 = r0();
        if (r02 == null) {
            return null;
        }
        if (!n0(context, r02, str, 0, -1, -1, null)) {
            m0(r02);
            return null;
        } else if (!p0(r02)) {
            return null;
        } else {
            return o0(r02);
        }
    }

    public final void m0(Object obj) {
        try {
            this.f45129q0.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean n0(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f45126n0.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface o0(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f45124l0, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f45130r0.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean p0(Object obj) {
        try {
            return ((Boolean) this.f45128p0.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean q0() {
        Method method = this.f45126n0;
        if (method == null) {
            AbstractC3612c.r("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public final Object r0() {
        try {
            return this.f45125m0.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method t0(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
