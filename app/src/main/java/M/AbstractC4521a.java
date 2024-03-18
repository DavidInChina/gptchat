package m;

import android.view.ViewGroup;

/* renamed from: m.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4521a extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public int f38727a;

    public AbstractC4521a(AbstractC4521a abstractC4521a) {
        super((ViewGroup.MarginLayoutParams) abstractC4521a);
        this.f38727a = 0;
        this.f38727a = abstractC4521a.f38727a;
    }

    public AbstractC4521a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f38727a = 0;
    }
}
