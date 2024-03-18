package w3;

import android.view.View;
import java.util.List;

/* renamed from: w3.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6113u {

    /* renamed from: a  reason: collision with root package name */
    public boolean f47977a;

    /* renamed from: b  reason: collision with root package name */
    public int f47978b;

    /* renamed from: c  reason: collision with root package name */
    public int f47979c;

    /* renamed from: d  reason: collision with root package name */
    public int f47980d;

    /* renamed from: e  reason: collision with root package name */
    public int f47981e;

    /* renamed from: f  reason: collision with root package name */
    public int f47982f;

    /* renamed from: g  reason: collision with root package name */
    public int f47983g;

    /* renamed from: h  reason: collision with root package name */
    public int f47984h;

    /* renamed from: i  reason: collision with root package name */
    public int f47985i;

    /* renamed from: j  reason: collision with root package name */
    public int f47986j;

    /* renamed from: k  reason: collision with root package name */
    public List f47987k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f47988l;

    public final void a(View view) {
        int c10;
        int size = this.f47987k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((Y) this.f47987k.get(i11)).f47800a;
            L l10 = (L) view3.getLayoutParams();
            if (view3 != view && !l10.f47767a.j() && (c10 = (l10.f47767a.c() - this.f47980d) * this.f47981e) >= 0 && c10 < i10) {
                view2 = view3;
                if (c10 == 0) {
                    break;
                }
                i10 = c10;
            }
        }
        if (view2 == null) {
            this.f47980d = -1;
        } else {
            this.f47980d = ((L) view2.getLayoutParams()).f47767a.c();
        }
    }

    public final View b(i3.g gVar) {
        List list = this.f47987k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((Y) this.f47987k.get(i10)).f47800a;
                L l10 = (L) view.getLayoutParams();
                if (!l10.f47767a.j() && this.f47980d == l10.f47767a.c()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = gVar.i(this.f47980d, Long.MAX_VALUE).f47800a;
        this.f47980d += this.f47981e;
        return view2;
    }
}
