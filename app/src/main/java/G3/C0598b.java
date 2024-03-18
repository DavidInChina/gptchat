package G3;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: G3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598b extends Property {

    /* renamed from: a  reason: collision with root package name */
    public Rect f5903a;

    @Override // android.util.Property
    public final Object get(Object obj) {
        Rect rect = this.f5903a;
        ((Drawable) obj).copyBounds(rect);
        return new PointF(rect.left, rect.top);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        Rect rect = this.f5903a;
        drawable.copyBounds(rect);
        rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(rect);
    }
}
