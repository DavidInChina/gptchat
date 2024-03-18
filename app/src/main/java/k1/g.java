package k1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final float f36847a;

    /* renamed from: b  reason: collision with root package name */
    public final float f36848b;

    /* renamed from: c  reason: collision with root package name */
    public final float f36849c;

    /* renamed from: d  reason: collision with root package name */
    public final float f36850d;

    /* renamed from: e  reason: collision with root package name */
    public final int f36851e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f36847a = Float.NaN;
        this.f36848b = Float.NaN;
        this.f36849c = Float.NaN;
        this.f36850d = Float.NaN;
        this.f36851e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f36953i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f36851e);
                this.f36851e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f36850d = obtainStyledAttributes.getDimension(index, this.f36850d);
            } else if (index == 2) {
                this.f36848b = obtainStyledAttributes.getDimension(index, this.f36848b);
            } else if (index == 3) {
                this.f36849c = obtainStyledAttributes.getDimension(index, this.f36849c);
            } else if (index == 4) {
                this.f36847a = obtainStyledAttributes.getDimension(index, this.f36847a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
