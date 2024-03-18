package o1;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.InvocationTargetException;
import t1.AbstractC5660f;

/* renamed from: o1.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4903s {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f40475a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f40476b;

    /* renamed from: c  reason: collision with root package name */
    public final Q[] f40477c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f40478d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f40479e;

    /* renamed from: f  reason: collision with root package name */
    public final int f40480f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f40481g;

    /* renamed from: h  reason: collision with root package name */
    public final int f40482h;

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f40483i;

    /* renamed from: j  reason: collision with root package name */
    public final PendingIntent f40484j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f40485k;

    public C4903s(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, Q[] qArr, Q[] qArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
        Bundle bundle2;
        this.f40479e = true;
        this.f40476b = iconCompat;
        if (iconCompat != null) {
            int i11 = iconCompat.f24917a;
            if (i11 == -1) {
                int i12 = Build.VERSION.SDK_INT;
                Object obj = iconCompat.f24918b;
                if (i12 >= 28) {
                    i11 = AbstractC5660f.c(obj);
                } else {
                    try {
                        i11 = ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
                    } catch (IllegalAccessException e10) {
                        AbstractC3612c.d("IconCompat", "Unable to get icon type " + obj, e10);
                    } catch (NoSuchMethodException e11) {
                        AbstractC3612c.d("IconCompat", "Unable to get icon type " + obj, e11);
                    } catch (InvocationTargetException e12) {
                        AbstractC3612c.d("IconCompat", "Unable to get icon type " + obj, e12);
                    }
                }
            }
            if (i11 == 2) {
                this.f40482h = iconCompat.c();
            }
        }
        this.f40483i = v.b(charSequence);
        this.f40484j = pendingIntent;
        if (bundle != null) {
            bundle2 = bundle;
        } else {
            bundle2 = new Bundle();
        }
        this.f40475a = bundle2;
        this.f40477c = qArr;
        this.f40478d = z10;
        this.f40480f = i10;
        this.f40479e = z11;
        this.f40481g = z12;
        this.f40485k = z13;
    }
}
