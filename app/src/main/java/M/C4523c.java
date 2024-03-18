package m;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: m.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4523c implements AdapterView.OnItemClickListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38730Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f38731Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f38732h0;

    public /* synthetic */ C4523c(Object obj, int i10, Object obj2) {
        this.f38730Y = i10;
        this.f38732h0 = obj;
        this.f38731Z = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j6) {
        int i11 = this.f38730Y;
        Object obj = this.f38732h0;
        switch (i11) {
            case 0:
                C4524d c4524d = (C4524d) obj;
                DialogInterface.OnClickListener onClickListener = c4524d.f38740h;
                C4527g c4527g = (C4527g) this.f38731Z;
                onClickListener.onClick(c4527g.f38746b, i10);
                if (!c4524d.f38741i) {
                    c4527g.f38746b.dismiss();
                    return;
                }
                return;
            default:
                q.T t10 = (q.T) obj;
                t10.f43358M0.setSelection(i10);
                q.W w10 = t10.f43358M0;
                if (w10.getOnItemClickListener() != null) {
                    w10.performItemClick(view, i10, t10.f43355J0.getItemId(i10));
                }
                t10.dismiss();
                return;
        }
    }
}
