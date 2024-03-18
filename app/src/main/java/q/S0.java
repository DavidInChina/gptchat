package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes2.dex */
public final class S0 extends A0 {

    /* renamed from: t0  reason: collision with root package name */
    public final int f43350t0;

    /* renamed from: u0  reason: collision with root package name */
    public final int f43351u0;

    /* renamed from: v0  reason: collision with root package name */
    public O0 f43352v0;

    /* renamed from: w0  reason: collision with root package name */
    public p.q f43353w0;

    public S0(Context context, boolean z10) {
        super(context, z10);
        if (1 == R0.a(context.getResources().getConfiguration())) {
            this.f43350t0 = 21;
            this.f43351u0 = 22;
            return;
        }
        this.f43350t0 = 22;
        this.f43351u0 = 21;
    }

    @Override // q.A0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i10;
        p.l lVar;
        p.q qVar;
        int pointToPosition;
        int i11;
        if (this.f43352v0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i10 = headerViewListAdapter.getHeadersCount();
                lVar = (p.l) headerViewListAdapter.getWrappedAdapter();
            } else {
                lVar = (p.l) adapter;
                i10 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < lVar.getCount()) {
                qVar = lVar.getItem(i11);
            } else {
                qVar = null;
            }
            p.q qVar2 = this.f43353w0;
            if (qVar2 != qVar) {
                p.o oVar = lVar.f41598Y;
                if (qVar2 != null) {
                    this.f43352v0.g(oVar, qVar2);
                }
                this.f43353w0 = qVar;
                if (qVar != null) {
                    this.f43352v0.z(oVar, qVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        p.l lVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i10 == this.f43350t0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && i10 == this.f43351u0) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                lVar = (p.l) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                lVar = (p.l) adapter;
            }
            lVar.f41598Y.c(false);
            return true;
        } else {
            return super.onKeyDown(i10, keyEvent);
        }
    }

    public void setHoverListener(O0 o02) {
        this.f43352v0 = o02;
    }

    @Override // q.A0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
