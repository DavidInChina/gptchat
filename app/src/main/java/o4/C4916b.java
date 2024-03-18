package o4;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import id.AbstractC3557B;
import p1.AbstractC5039d;
import p1.AbstractC5042g;

/* renamed from: o4.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4916b {

    /* renamed from: a  reason: collision with root package name */
    public final double f40577a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f40578b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f40579c;

    public C4916b(Context context) {
        Bitmap.Config[] configArr = u4.e.f46388a;
        double d10 = 0.2d;
        try {
            Object obj = AbstractC5042g.f41723a;
            Object b10 = AbstractC5039d.b(context, ActivityManager.class);
            AbstractC3557B.Z(b10);
            if (((ActivityManager) b10).isLowRamDevice()) {
                d10 = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.f40577a = d10;
        this.f40578b = true;
        this.f40579c = true;
    }
}
