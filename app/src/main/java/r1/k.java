package r1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f44295a;

    /* renamed from: b  reason: collision with root package name */
    public final Configuration f44296b;

    /* renamed from: c  reason: collision with root package name */
    public final int f44297c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int i10;
        this.f44295a = colorStateList;
        this.f44296b = configuration;
        if (theme == null) {
            i10 = 0;
        } else {
            i10 = theme.hashCode();
        }
        this.f44297c = i10;
    }
}
