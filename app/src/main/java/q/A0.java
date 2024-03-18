package q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.openai.chatgpt.R;
import g.RunnableC3118k;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import n.AbstractC4699j;
import t1.AbstractC5656b;
import y1.AbstractC6492b;

/* loaded from: classes.dex */
public class A0 extends ListView {

    /* renamed from: h0  reason: collision with root package name */
    public final Rect f43215h0 = new Rect();

    /* renamed from: i0  reason: collision with root package name */
    public int f43216i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public int f43217j0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public int f43218k0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public int f43219l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public int f43220m0;

    /* renamed from: n0  reason: collision with root package name */
    public C5246y0 f43221n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f43222o0;

    /* renamed from: p0  reason: collision with root package name */
    public final boolean f43223p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f43224q0;

    /* renamed from: r0  reason: collision with root package name */
    public H1.g f43225r0;

    /* renamed from: s0  reason: collision with root package name */
    public RunnableC3118k f43226s0;

    public A0(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f43223p0 = z10;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int i12;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i13 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i14 = 0;
        View view = null;
        for (int i15 = 0; i15 < count; i15++) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i14) {
                view = null;
                i14 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i16 = layoutParams.height;
            if (i16 > 0) {
                i12 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
            } else {
                i12 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i10, i12);
            view.forceLayout();
            if (i15 > 0) {
                i13 += dividerHeight;
            }
            i13 += view.getMeasuredHeight();
            if (i13 >= i11) {
                return i11;
            }
        }
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i10) {
        boolean z10;
        View childAt;
        boolean z11;
        boolean z12;
        boolean z13;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z14 = false;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z10 = true;
                    if (z10 || z14) {
                        this.f43224q0 = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt = getChildAt(this.f43220m0 - getFirstVisiblePosition());
                        if (childAt != null) {
                            childAt.setPressed(false);
                        }
                    }
                    if (!z10) {
                        if (this.f43225r0 == null) {
                            this.f43225r0 = new H1.g(this);
                        }
                        H1.g gVar = this.f43225r0;
                        boolean z15 = gVar.f7178u0;
                        gVar.f7178u0 = true;
                        gVar.d(this, motionEvent);
                    } else {
                        H1.g gVar2 = this.f43225r0;
                        if (gVar2 != null) {
                            if (gVar2.f7178u0) {
                                gVar2.e();
                            }
                            gVar2.f7178u0 = false;
                        }
                    }
                    return z10;
                }
                z10 = false;
                if (z10) {
                }
                this.f43224q0 = false;
                setPressed(false);
                drawableStateChanged();
                childAt = getChildAt(this.f43220m0 - getFirstVisiblePosition());
                if (childAt != null) {
                }
                if (!z10) {
                }
                return z10;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        if (findPointerIndex >= 0) {
            int x10 = (int) motionEvent.getX(findPointerIndex);
            int y10 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x10, y10);
            if (pointToPosition == -1) {
                z14 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f6 = x10;
                float f10 = y10;
                this.f43224q0 = true;
                AbstractC5240v0.a(this, f6, f10);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.f43220m0;
                if (i11 != -1 && (childAt2 = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt2 != childAt3 && childAt2.isPressed()) {
                    childAt2.setPressed(false);
                }
                this.f43220m0 = pointToPosition;
                AbstractC5240v0.a(childAt3, f6 - childAt3.getLeft(), f10 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                if (selector != null && pointToPosition != -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f43215h0;
                rect.set(left, top, right, bottom);
                rect.left -= this.f43216i0;
                rect.top -= this.f43217j0;
                rect.right += this.f43218k0;
                rect.bottom += this.f43219l0;
                if (AbstractC6492b.a()) {
                    z12 = AbstractC5244x0.a(this);
                } else {
                    Field field = AbstractC5248z0.f43597a;
                    if (field != null) {
                        try {
                            z12 = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        }
                    }
                    z12 = false;
                }
                if (childAt3.isEnabled() != z12) {
                    boolean z16 = !z12;
                    if (AbstractC6492b.a()) {
                        AbstractC5244x0.b(this, z16);
                    } else {
                        Field field2 = AbstractC5248z0.f43597a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z16));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z11) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    if (getVisibility() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    selector.setVisible(z13, false);
                    AbstractC5656b.e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    AbstractC5656b.e(selector2, f6, f10);
                }
                C5246y0 c5246y0 = this.f43221n0;
                if (c5246y0 != null) {
                    c5246y0.f43588Z = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z10 = true;
                z14 = false;
            }
            if (z10) {
            }
            this.f43224q0 = false;
            setPressed(false);
            drawableStateChanged();
            childAt = getChildAt(this.f43220m0 - getFirstVisiblePosition());
            if (childAt != null) {
            }
            if (!z10) {
            }
            return z10;
        }
        z10 = false;
        if (z10) {
        }
        this.f43224q0 = false;
        setPressed(false);
        drawableStateChanged();
        childAt = getChildAt(this.f43220m0 - getFirstVisiblePosition());
        if (childAt != null) {
        }
        if (!z10) {
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f43215h0;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f43226s0 != null) {
            return;
        }
        super.drawableStateChanged();
        C5246y0 c5246y0 = this.f43221n0;
        if (c5246y0 != null) {
            c5246y0.f43588Z = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f43224q0 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f43223p0 && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f43223p0 && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f43223p0 && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.f43223p0 && this.f43222o0) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f43226s0 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f43226s0 == null) {
            RunnableC3118k runnableC3118k = new RunnableC3118k(2, this);
            this.f43226s0 = runnableC3118k;
            post(runnableC3118k);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 >= 30 && AbstractC5242w0.f43582d) {
                        try {
                            AbstractC5242w0.f43579a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC5242w0.f43580b.invoke(this, Integer.valueOf(pointToPosition));
                            AbstractC5242w0.f43581c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f43224q0 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f43220m0 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC3118k runnableC3118k = this.f43226s0;
        if (runnableC3118k != null) {
            A0 a02 = (A0) runnableC3118k.f30960Z;
            a02.f43226s0 = null;
            a02.removeCallbacks(runnableC3118k);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f43222o0 = z10;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [q.y0, n.j] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C5246y0 c5246y0;
        if (drawable != null) {
            ?? abstractC4699j = new AbstractC4699j(drawable);
            abstractC4699j.f43588Z = true;
            c5246y0 = abstractC4699j;
        } else {
            c5246y0 = null;
        }
        this.f43221n0 = c5246y0;
        super.setSelector(c5246y0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f43216i0 = rect.left;
        this.f43217j0 = rect.top;
        this.f43218k0 = rect.right;
        this.f43219l0 = rect.bottom;
    }
}
