package me;

import id.AbstractC3557B;
import ve.AbstractC6034c;

/* loaded from: classes2.dex */
public class T extends IllegalStateException {

    /* renamed from: Y  reason: collision with root package name */
    public final transient AbstractC6034c f39189Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(AbstractC6034c abstractC6034c, String str) {
        super("Bad response: " + abstractC6034c + ". Text: \"" + str + '\"');
        AbstractC3557B.c0("response", abstractC6034c);
        AbstractC3557B.c0("cachedResponseText", str);
        this.f39189Y = abstractC6034c;
    }
}
