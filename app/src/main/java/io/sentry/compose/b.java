package io.sentry.compose;

import L0.u;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import bb.B0;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final u f34309a = new u("SentryTag", a.f34308Y);

    public static final AbstractC4326r a(String str) {
        return new AppendedSemanticsElement(new B0(str, 12), false);
    }
}
