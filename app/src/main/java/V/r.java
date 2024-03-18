package V;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class r extends ViewGroup {

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f17966i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f17967j0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f17965h0 = 5;

    /* renamed from: k0  reason: collision with root package name */
    public final s f17968k0 = new s(0);

    /* renamed from: l0  reason: collision with root package name */
    public int f17969l0 = 1;

    public r(Context context) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f17966i0 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f17967j0 = arrayList2;
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
