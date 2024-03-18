package V1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.openai.chatgpt.R;
import m.AbstractC4508E;
import y1.C6497g;

/* renamed from: V1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467h extends AbstractC4508E {

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f18201h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f18202i0;

    /* renamed from: j0  reason: collision with root package name */
    public U3.c f18203j0;

    public C1467h(e0 e0Var, C6497g c6497g, boolean z10) {
        super(e0Var, c6497g);
        this.f18201h0 = z10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:66|(3:88|68|(4:70|71|83|84))|86|74|(4:76|71|83|84)) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ed, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ee, code lost:
        if (r0 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f0, code lost:
        r9 = android.view.animation.AnimationUtils.loadAnimation(r9, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f4, code lost:
        if (r9 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f6, code lost:
        r9 = new U3.c(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fd, code lost:
        throw r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final U3.c k(Context context) {
        boolean z10;
        int i10;
        int i11;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        U3.c cVar;
        Animation loadAnimation;
        U3.c cVar2;
        int i12;
        if (this.f18202i0) {
            return this.f18203j0;
        }
        e0 e0Var = (e0) this.f38593Y;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = e0Var.f18185c;
        if (e0Var.f18183a == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1479u c1479u = abstractComponentCallbacksC1480v.f18272M0;
        if (c1479u == null) {
            i10 = 0;
        } else {
            i10 = c1479u.f18251f;
        }
        if (this.f18201h0) {
            if (z10) {
                if (c1479u != null) {
                    i11 = c1479u.f18249d;
                    abstractComponentCallbacksC1480v.M(0, 0, 0, 0);
                    viewGroup = abstractComponentCallbacksC1480v.f18268I0;
                    if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                        abstractComponentCallbacksC1480v.f18268I0.setTag(R.id.visible_removing_fragment_view_tag, null);
                    }
                    viewGroup2 = abstractComponentCallbacksC1480v.f18268I0;
                    if (viewGroup2 != null || viewGroup2.getLayoutTransition() == null) {
                        if (i11 == 0 && i10 != 0) {
                            if (i10 == 4097) {
                                if (i10 != 8194) {
                                    if (i10 != 8197) {
                                        if (i10 != 4099) {
                                            if (i10 != 4100) {
                                                i12 = -1;
                                            } else if (z10) {
                                                i12 = R4.b.f2(context, 16842936);
                                            } else {
                                                i12 = R4.b.f2(context, 16842937);
                                            }
                                        } else if (z10) {
                                            i12 = R.animator.fragment_fade_enter;
                                        } else {
                                            i12 = R.animator.fragment_fade_exit;
                                        }
                                    } else if (z10) {
                                        i12 = R4.b.f2(context, 16842938);
                                    } else {
                                        i12 = R4.b.f2(context, 16842939);
                                    }
                                } else if (z10) {
                                    i12 = R.animator.fragment_close_enter;
                                } else {
                                    i12 = R.animator.fragment_close_exit;
                                }
                            } else if (z10) {
                                i12 = R.animator.fragment_open_enter;
                            } else {
                                i12 = R.animator.fragment_open_exit;
                            }
                            i11 = i12;
                        }
                        if (i11 != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(i11));
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, i11);
                                } catch (Resources.NotFoundException e10) {
                                    throw e10;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    cVar2 = new U3.c(loadAnimation);
                                    cVar = cVar2;
                                    this.f18203j0 = cVar;
                                    this.f18202i0 = true;
                                    return cVar;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i11);
                            if (loadAnimator != null) {
                                cVar2 = new U3.c(loadAnimator);
                                cVar = cVar2;
                                this.f18203j0 = cVar;
                                this.f18202i0 = true;
                                return cVar;
                            }
                        }
                    }
                    cVar = null;
                    this.f18203j0 = cVar;
                    this.f18202i0 = true;
                    return cVar;
                }
                i11 = 0;
                abstractComponentCallbacksC1480v.M(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC1480v.f18268I0;
                if (viewGroup != null) {
                    abstractComponentCallbacksC1480v.f18268I0.setTag(R.id.visible_removing_fragment_view_tag, null);
                }
                viewGroup2 = abstractComponentCallbacksC1480v.f18268I0;
                if (viewGroup2 != null) {
                }
                if (i11 == 0) {
                    if (i10 == 4097) {
                    }
                    i11 = i12;
                }
                if (i11 != 0) {
                }
                cVar = null;
                this.f18203j0 = cVar;
                this.f18202i0 = true;
                return cVar;
            }
            if (c1479u != null) {
                i11 = c1479u.f18250e;
                abstractComponentCallbacksC1480v.M(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC1480v.f18268I0;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC1480v.f18268I0;
                if (viewGroup2 != null) {
                }
                if (i11 == 0) {
                }
                if (i11 != 0) {
                }
                cVar = null;
                this.f18203j0 = cVar;
                this.f18202i0 = true;
                return cVar;
            }
            i11 = 0;
            abstractComponentCallbacksC1480v.M(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC1480v.f18268I0;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC1480v.f18268I0;
            if (viewGroup2 != null) {
            }
            if (i11 == 0) {
            }
            if (i11 != 0) {
            }
            cVar = null;
            this.f18203j0 = cVar;
            this.f18202i0 = true;
            return cVar;
        } else if (z10) {
            if (c1479u != null) {
                i11 = c1479u.f18247b;
                abstractComponentCallbacksC1480v.M(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC1480v.f18268I0;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC1480v.f18268I0;
                if (viewGroup2 != null) {
                }
                if (i11 == 0) {
                }
                if (i11 != 0) {
                }
                cVar = null;
                this.f18203j0 = cVar;
                this.f18202i0 = true;
                return cVar;
            }
            i11 = 0;
            abstractComponentCallbacksC1480v.M(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC1480v.f18268I0;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC1480v.f18268I0;
            if (viewGroup2 != null) {
            }
            if (i11 == 0) {
            }
            if (i11 != 0) {
            }
            cVar = null;
            this.f18203j0 = cVar;
            this.f18202i0 = true;
            return cVar;
        } else {
            if (c1479u != null) {
                i11 = c1479u.f18248c;
                abstractComponentCallbacksC1480v.M(0, 0, 0, 0);
                viewGroup = abstractComponentCallbacksC1480v.f18268I0;
                if (viewGroup != null) {
                }
                viewGroup2 = abstractComponentCallbacksC1480v.f18268I0;
                if (viewGroup2 != null) {
                }
                if (i11 == 0) {
                }
                if (i11 != 0) {
                }
                cVar = null;
                this.f18203j0 = cVar;
                this.f18202i0 = true;
                return cVar;
            }
            i11 = 0;
            abstractComponentCallbacksC1480v.M(0, 0, 0, 0);
            viewGroup = abstractComponentCallbacksC1480v.f18268I0;
            if (viewGroup != null) {
            }
            viewGroup2 = abstractComponentCallbacksC1480v.f18268I0;
            if (viewGroup2 != null) {
            }
            if (i11 == 0) {
            }
            if (i11 != 0) {
            }
            cVar = null;
            this.f18203j0 = cVar;
            this.f18202i0 = true;
            return cVar;
        }
    }
}
