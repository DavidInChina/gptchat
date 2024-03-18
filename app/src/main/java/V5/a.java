package V5;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class a extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f18395Y = new o(0);

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        return "You're trying to create a Logger instance, but the SDK was not yet initialized. This Logger will not be able to send any messages. Please initialize the Datadog SDK first before creating a new Logger instance.";
    }
}
