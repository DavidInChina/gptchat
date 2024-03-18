package Z1;

import android.os.Build;
import android.widget.RemoteViews;
import id.AbstractC3557B;
import j2.AbstractC3905g;
import j2.C3901c;
import j2.C3902d;
import j2.C3903e;
import j2.C3904f;

/* renamed from: Z1.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1776s {

    /* renamed from: a  reason: collision with root package name */
    public static final C1776s f23096a = new Object();

    public final void a(RemoteViews remoteViews, int i10, AbstractC3905g abstractC3905g) {
        AbstractC3557B.c0("<this>", remoteViews);
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setBoolean(i10, "setClipToOutline", true);
            if (abstractC3905g instanceof C3901c) {
                remoteViews.setViewOutlinePreferredRadius(i10, ((C3901c) abstractC3905g).f36004a, 1);
                return;
            }
            throw new IllegalStateException(("Rounded corners should not be " + abstractC3905g.getClass().getCanonicalName()).toString());
        }
        throw new IllegalArgumentException(("setClipToOutline is only available on SDK 31 and higher").toString());
    }

    public final void b(RemoteViews remoteViews, int i10, AbstractC3905g abstractC3905g) {
        if (abstractC3905g instanceof C3904f) {
            remoteViews.setViewLayoutHeight(i10, -2.0f, 0);
        } else if (abstractC3905g instanceof C3902d) {
            remoteViews.setViewLayoutHeight(i10, 0.0f, 0);
        } else if (abstractC3905g instanceof C3901c) {
            remoteViews.setViewLayoutHeight(i10, ((C3901c) abstractC3905g).f36004a, 1);
        } else if (AbstractC3557B.K(abstractC3905g, C3903e.f36006a)) {
            remoteViews.setViewLayoutHeight(i10, -1.0f, 0);
        } else {
            throw new RuntimeException();
        }
    }

    public final void c(RemoteViews remoteViews, int i10, AbstractC3905g abstractC3905g) {
        if (abstractC3905g instanceof C3904f) {
            remoteViews.setViewLayoutWidth(i10, -2.0f, 0);
        } else if (abstractC3905g instanceof C3902d) {
            remoteViews.setViewLayoutWidth(i10, 0.0f, 0);
        } else if (abstractC3905g instanceof C3901c) {
            remoteViews.setViewLayoutWidth(i10, ((C3901c) abstractC3905g).f36004a, 1);
        } else if (AbstractC3557B.K(abstractC3905g, C3903e.f36006a)) {
            remoteViews.setViewLayoutWidth(i10, -1.0f, 0);
        } else {
            throw new RuntimeException();
        }
    }
}
