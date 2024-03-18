package com.google.protobuf;

/* loaded from: classes.dex */
public final class W implements K0 {

    /* renamed from: a  reason: collision with root package name */
    public static final W f27503a = new Object();

    @Override // com.google.protobuf.K0
    public final J0 a(Class cls) {
        if (AbstractC2497d0.class.isAssignableFrom(cls)) {
            try {
                return (J0) AbstractC2497d0.getDefaultInstance(cls.asSubclass(AbstractC2497d0.class)).buildMessageInfo();
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.K0
    public final boolean b(Class cls) {
        return AbstractC2497d0.class.isAssignableFrom(cls);
    }
}
