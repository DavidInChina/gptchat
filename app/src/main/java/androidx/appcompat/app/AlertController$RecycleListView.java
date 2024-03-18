package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import l.AbstractC4308a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: h0  reason: collision with root package name */
    public final int f24349h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f24350i0;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4308a.f37683t);
        this.f24350i0 = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f24349h0 = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
