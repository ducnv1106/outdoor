package brite.outdoor.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00fa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u0097\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u0099\u0001\u001a\u00020-J\u0011\u0010\u009a\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u0099\u0001\u001a\u00020-J-\u0010\u009b\u0001\u001a\u00030\u0098\u00012#\u0010\u009c\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J-\u0010\u009d\u0001\u001a\u00030\u0098\u00012#\u0010\u009c\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J/\u0010\u009e\u0001\u001a\u00030\u0098\u00012\u000b\b\u0002\u0010\u009f\u0001\u001a\u0004\u0018\u00010C2\t\b\u0002\u0010\u00a0\u0001\u001a\u00020C2\u0007\u0010\u00a1\u0001\u001a\u00020C\u00a2\u0006\u0003\u0010\u00a2\u0001J-\u0010\u00a3\u0001\u001a\u00030\u0098\u00012#\u0010\u00a3\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J-\u0010\u00a4\u0001\u001a\u00030\u0098\u00012#\u0010\u00a4\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J-\u0010\u00a5\u0001\u001a\u00030\u0098\u00012#\u0010\u00a5\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J-\u0010\u00a6\u0001\u001a\u00030\u0098\u00012#\u0010\u00a6\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J-\u0010\u00a7\u0001\u001a\u00030\u0098\u00012#\u0010\u00a7\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J-\u0010\u00a8\u0001\u001a\u00030\u0098\u00012#\u0010\u00a8\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J-\u0010\u00a9\u0001\u001a\u00030\u0098\u00012#\u0010\u00a9\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J-\u0010\u00aa\u0001\u001a\u00030\u0098\u00012#\u0010\u00aa\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J-\u0010\u00ab\u0001\u001a\u00030\u0098\u00012#\u0010\u00ab\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J-\u0010\u00ac\u0001\u001a\u00030\u0098\u00012#\u0010\u00ac\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J-\u0010\u00ad\u0001\u001a\u00030\u0098\u00012#\u0010\u00ad\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J-\u0010\u00ae\u0001\u001a\u00030\u0098\u00012#\u0010\u00ae\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J-\u0010\u00af\u0001\u001a\u00030\u0098\u00012#\u0010\u00af\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.J6\u0010\u00b0\u0001\u001a\u00030\u0098\u00012#\u0010\u00b1\u0001\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.2\u0007\u0010\u00b2\u0001\u001a\u00020-J+\u0010\u00b3\u0001\u001a\u00030\u0098\u00012\b\u0010\u00b4\u0001\u001a\u00030\u00b5\u00012\u0017\u0010\u00b6\u0001\u001a\u0012\u0012\u0004\u0012\u00020e0dj\b\u0012\u0004\u0012\u00020e`fJ\"\u0010\u00b7\u0001\u001a\u00030\u0098\u00012\b\u0010\u00b8\u0001\u001a\u00030\u00b9\u00012\u000e\u0010\u00b6\u0001\u001a\t\u0012\u0004\u0012\u00020n0\u00ba\u0001J\u001c\u0010\u00bb\u0001\u001a\u00030\u0098\u00012\b\u0010\u00b4\u0001\u001a\u00030\u00b5\u00012\b\u0010\u00bc\u0001\u001a\u00030\u00bd\u0001J\u001c\u0010\u00be\u0001\u001a\u00030\u0098\u00012\b\u0010\u00b8\u0001\u001a\u00030\u00b9\u00012\b\u0010\u00bf\u0001\u001a\u00030\u00c0\u0001J\u0010\u0010F\u001a\u00030\u0098\u00012\u0007\u0010\u00c1\u0001\u001a\u00020CR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010*\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010/\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u00100\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u00101\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u00102\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u00103\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u00104\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u00105\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u00106\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u00107\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u00108\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u00109\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010:\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010;\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-`.0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001d\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010?R \u0010B\u001a\b\u0012\u0004\u0012\u00020C0+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001d\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010?R\u001d\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010?R\u001a\u0010L\u001a\u00020CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0+\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010ER\u001a\u0010S\u001a\u00020RX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020RX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010T\"\u0004\bX\u0010VR\u001f\u0010Y\u001a\u0010\u0012\f\u0012\n Z*\u0004\u0018\u00010R0R0+\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010ER\u001a\u0010[\u001a\u00020RX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010T\"\u0004\b\\\u0010VR\u001a\u0010]\u001a\u00020RX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010T\"\u0004\b^\u0010VR\u001d\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010?R\u001d\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010?R*\u0010c\u001a\u0012\u0012\u0004\u0012\u00020e0dj\b\u0012\u0004\u0012\u00020e`fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001d\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010?R*\u0010m\u001a\u0012\u0012\u0004\u0012\u00020n0dj\b\u0012\u0004\u0012\u00020n`fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010h\"\u0004\bp\u0010jR\u001d\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010?R\u001a\u0010s\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001a\u0010x\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010u\"\u0004\bz\u0010wR \u0010{\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,0+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010|\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020-0,0+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b0~\u00a2\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001f\u0010\u0081\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000b0\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010?R\u001f\u0010\u0083\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000b0\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010?R\u001f\u0010\u0085\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000b0\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010?R\u001d\u0010\u0087\u0001\u001a\u00020CX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010N\"\u0005\b\u0089\u0001\u0010PR\u001f\u0010\u008a\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000b0\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010?R\u001d\u0010\u008c\u0001\u001a\u00020CX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010N\"\u0005\b\u008e\u0001\u0010PR\u001f\u0010\u008f\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u000b0\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010?R\u001f\u0010\u0091\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u000b0\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010?R$\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010+X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010E\"\u0005\b\u0096\u0001\u0010G\u00a8\u0006\u00c2\u0001"}, d2 = {"Lbrite/outdoor/viewmodel/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "gson", "Lcom/google/gson/Gson;", "apiController", "Lbrite/outdoor/data/remote/ApiController;", "appRepository", "Lbrite/outdoor/data/repository/AppRepository;", "(Lcom/google/gson/Gson;Lbrite/outdoor/data/remote/ApiController;Lbrite/outdoor/data/repository/AppRepository;)V", "_cancelMergeAccountResult", "Landroidx/lifecycle/LiveData;", "Lbrite/outdoor/data/remote/ApiResult;", "Lbrite/outdoor/data/api_entities/response/ResponseCancelMergeAccount$CancelMergeAccountResult;", "_checkCodeHashResult", "Lbrite/outdoor/data/api_entities/response/ResponseCheckCodeHash$CheckCodeHashResult;", "_createHashResult", "Lbrite/outdoor/data/api_entities/response/ResponseCreateHash$CreateHashResult;", "_createNewAccountResult", "Lbrite/outdoor/data/api_entities/response/ResponseCreateNewAccount$CreateNewAccountResult;", "_likeResult", "Lbrite/outdoor/data/api_entities/response/ResponseLike$LikesResult;", "_likeResultPostHotNews", "Lbrite/outdoor/data/api_entities/ResponseLikePostHotNews$LikePostHotNewsResult;", "_listLocationResult", "Lbrite/outdoor/data/api_entities/response/ResponseListLocation$LocationResult;", "_listUtensilsResult", "Lbrite/outdoor/data/api_entities/response/ResponseListUtensils$UtensilsResult;", "_loginFacebookResult", "Lbrite/outdoor/data/api_entities/response/ResponseLogin$LoginResult;", "_loginGoogleResult", "_logoutResult", "Lbrite/outdoor/data/api_entities/response/ResponseLogout$LogoutResult;", "_mergeAccountResult", "Lbrite/outdoor/data/api_entities/response/ResponseMergeAccount$MergerAccountResult;", "_notifyUnreadResult", "Lbrite/outdoor/data/api_entities/response/ResponseNotifyUnread$NotifyUnreadResult;", "_postHotNewsShareResult", "Lbrite/outdoor/data/api_entities/response/ResponseSharePostHotNews$SharePostHotNewsResult;", "_postShareResult", "Lbrite/outdoor/data/api_entities/response/ResponseShares$SharesResult;", "_registerTokenPushResult", "Lbrite/outdoor/data/api_entities/response/ResponseRegisterToken$RegisterTokenResult;", "_requestCancelMergeAccount", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "_requestCheckCodeHash", "_requestCreateHash", "_requestCreateNewAccount", "_requestLike", "_requestLikePostHotNews", "_requestListLocation", "_requestListUtensils", "_requestLogout", "_requestMergeAccount", "_requestNotifyUnread", "_requestPostHotNewsShare", "_requestPostShare", "_requestRegisterToken", "_userId", "cancelMergeAccountResult", "getCancelMergeAccountResult", "()Landroidx/lifecycle/LiveData;", "checkCodeHashResult", "getCheckCodeHashResult", "countNotifyUnread", "", "getCountNotifyUnread", "()Landroidx/lifecycle/MutableLiveData;", "setCountNotifyUnread", "(Landroidx/lifecycle/MutableLiveData;)V", "createHashResult", "getCreateHashResult", "createNewAccountResult", "getCreateNewAccountResult", "currentFragmentPostShareAndLike", "getCurrentFragmentPostShareAndLike", "()I", "setCurrentFragmentPostShareAndLike", "(I)V", "isChangeLanguage", "", "isHaveLocalDataSelectPlace", "()Z", "setHaveLocalDataSelectPlace", "(Z)V", "isHaveLocalDataSelectUtensils", "setHaveLocalDataSelectUtensils", "isOpenKeyboard", "kotlin.jvm.PlatformType", "isUpdateOrReplaceLocation", "setUpdateOrReplaceLocation", "isUpdateOrReplaceUtensil", "setUpdateOrReplaceUtensil", "likeResult", "getLikeResult", "likeResultPostHotNews", "getLikeResultPostHotNews", "listLocationLocal", "Ljava/util/ArrayList;", "Lbrite/outdoor/data/api_entities/response/ResponseListLocation$LocationData;", "Lkotlin/collections/ArrayList;", "getListLocationLocal", "()Ljava/util/ArrayList;", "setListLocationLocal", "(Ljava/util/ArrayList;)V", "listLocationResult", "getListLocationResult", "listUtensilLocal", "Lbrite/outdoor/data/api_entities/response/ResponseListUtensils$UtensilsData;", "getListUtensilLocal", "setListUtensilLocal", "listUtensilsResult", "getListUtensilsResult", "locale", "getLocale", "()Ljava/lang/String;", "setLocale", "(Ljava/lang/String;)V", "loggingWith", "getLoggingWith", "setLoggingWith", "loginFacebookInfo", "loginGoogleInfo", "loginResult", "Landroidx/lifecycle/MediatorLiveData;", "getLoginResult", "()Landroidx/lifecycle/MediatorLiveData;", "logoutResult", "getLogoutResult", "mergeAccountResult", "getMergeAccountResult", "notifyUnreadResult", "getNotifyUnreadResult", "positionPostShareAndLike", "getPositionPostShareAndLike", "setPositionPostShareAndLike", "postHotNewsShareResult", "getPostHotNewsShareResult", "postIdShareAndLike", "getPostIdShareAndLike", "setPostIdShareAndLike", "postShareResult", "getPostShareResult", "registerTokenPushResult", "getRegisterTokenPushResult", "syncComment", "Lbrite/outdoor/data/entities/CommentEntity;", "getSyncComment", "setSyncComment", "getPostSelectPlaceContentInDB", "", "id", "getPostSelectUtensilsContentInDB", "loginWithFacebook", "requestParam", "loginWithGoogle", "positionPostShareAndLikeNeedNotifyChange", "postIdShareAndLikeParam", "positionPostShareAndLikeParam", "currentFragmentParam", "(Ljava/lang/Integer;II)V", "requestCancelMergeAccount", "requestCheckCodeHash", "requestCreateHash", "requestCreateNewAccount", "requestLike", "requestLikePostHotNews", "requestListLocation", "requestListUtensils", "requestLogout", "requestMergeAccount", "requestNotifyUnread", "requestPostHotNewsShare", "requestPostShare", "requestRegisterTokenPush", "requestRegisterToken", "userId", "saveListLocationToLocal", "saveListLocationLocal", "Lbrite/outdoor/data/local/room/SaveListLocationLocal;", "list", "saveListUtensilsToLocal", "saveListUtensilsLocal", "Lbrite/outdoor/data/local/room/SaveListUtensilsLocal;", "", "saveLocationEntity", "location", "Lbrite/outdoor/data/entities/LocationEntityConvert;", "saveUtensilEntity", "utensils", "Lbrite/outdoor/data/entities/UtensilEntityConvert;", "count", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isChangeLanguage = null;
    private boolean isUpdateOrReplaceLocation = true;
    private boolean isUpdateOrReplaceUtensil = true;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> listLocationLocal;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData> listUtensilLocal;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.CommentEntity> syncComment;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isOpenKeyboard = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String loggingWith = "UNKNOWN";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String locale = "";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseLogin.LoginResult>> loginResult = null;
    private androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> loginGoogleInfo;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseLogin.LoginResult>> _loginGoogleResult = null;
    private androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> loginFacebookInfo;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseLogin.LoginResult>> _loginFacebookResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestLogout = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseLogout.LogoutResult>> _logoutResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseLogout.LogoutResult>> logoutResult = null;
    private java.lang.String _userId = "";
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestRegisterToken = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseRegisterToken.RegisterTokenResult>> _registerTokenPushResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseRegisterToken.RegisterTokenResult>> registerTokenPushResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestCreateHash = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCreateHash.CreateHashResult>> _createHashResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCreateHash.CreateHashResult>> createHashResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestCreateNewAccount = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCreateNewAccount.CreateNewAccountResult>> _createNewAccountResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCreateNewAccount.CreateNewAccountResult>> createNewAccountResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestCheckCodeHash = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCheckCodeHash.CheckCodeHashResult>> _checkCodeHashResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCheckCodeHash.CheckCodeHashResult>> checkCodeHashResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestMergeAccount = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseMergeAccount.MergerAccountResult>> _mergeAccountResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseMergeAccount.MergerAccountResult>> mergeAccountResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestCancelMergeAccount = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCancelMergeAccount.CancelMergeAccountResult>> _cancelMergeAccountResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCancelMergeAccount.CancelMergeAccountResult>> cancelMergeAccountResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListLocation = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationResult>> _listLocationResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationResult>> listLocationResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestListUtensils = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsResult>> _listUtensilsResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsResult>> listUtensilsResult = null;
    private boolean isHaveLocalDataSelectPlace = false;
    private boolean isHaveLocalDataSelectUtensils = false;
    private int postIdShareAndLike = 0;
    private int positionPostShareAndLike = 0;
    private int currentFragmentPostShareAndLike = 0;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestPostShare = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseShares.SharesResult>> _postShareResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseShares.SharesResult>> postShareResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestPostHotNewsShare = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseSharePostHotNews.SharePostHotNewsResult>> _postHotNewsShareResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseSharePostHotNews.SharePostHotNewsResult>> postHotNewsShareResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestLike = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseLike.LikesResult>> _likeResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseLike.LikesResult>> likeResult = null;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestLikePostHotNews = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.ResponseLikePostHotNews.LikePostHotNewsResult>> _likeResultPostHotNews = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.ResponseLikePostHotNews.LikePostHotNewsResult>> likeResultPostHotNews = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> countNotifyUnread;
    private final androidx.lifecycle.MutableLiveData<java.util.HashMap<java.lang.String, java.lang.String>> _requestNotifyUnread = null;
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseNotifyUnread.NotifyUnreadResult>> _notifyUnreadResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseNotifyUnread.NotifyUnreadResult>> notifyUnreadResult = null;
    private final com.google.gson.Gson gson = null;
    private final brite.outdoor.data.remote.ApiController apiController = null;
    private final brite.outdoor.data.repository.AppRepository appRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isChangeLanguage() {
        return null;
    }
    
    public final boolean isUpdateOrReplaceLocation() {
        return false;
    }
    
    public final void setUpdateOrReplaceLocation(boolean p0) {
    }
    
    public final boolean isUpdateOrReplaceUtensil() {
        return false;
    }
    
    public final void setUpdateOrReplaceUtensil(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> getListLocationLocal() {
        return null;
    }
    
    public final void setListLocationLocal(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData> getListUtensilLocal() {
        return null;
    }
    
    public final void setListUtensilLocal(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.CommentEntity> getSyncComment() {
        return null;
    }
    
    public final void setSyncComment(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<brite.outdoor.data.entities.CommentEntity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isOpenKeyboard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLoggingWith() {
        return null;
    }
    
    public final void setLoggingWith(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocale() {
        return null;
    }
    
    public final void setLocale(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseLogin.LoginResult>> getLoginResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseLogout.LogoutResult>> getLogoutResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseRegisterToken.RegisterTokenResult>> getRegisterTokenPushResult() {
        return null;
    }
    
    public final void loginWithGoogle(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestParam) {
    }
    
    public final void loginWithFacebook(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestParam) {
    }
    
    public final void requestRegisterTokenPush(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestRegisterToken, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    public final void requestLogout(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestLogout) {
    }
    
    public final void requestCreateHash(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestCreateHash) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCreateHash.CreateHashResult>> getCreateHashResult() {
        return null;
    }
    
    public final void requestCreateNewAccount(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestCreateNewAccount) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCreateNewAccount.CreateNewAccountResult>> getCreateNewAccountResult() {
        return null;
    }
    
    public final void requestCheckCodeHash(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestCheckCodeHash) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCheckCodeHash.CheckCodeHashResult>> getCheckCodeHashResult() {
        return null;
    }
    
    public final void requestMergeAccount(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestMergeAccount) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseMergeAccount.MergerAccountResult>> getMergeAccountResult() {
        return null;
    }
    
    public final void requestCancelMergeAccount(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestCancelMergeAccount) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseCancelMergeAccount.CancelMergeAccountResult>> getCancelMergeAccountResult() {
        return null;
    }
    
    public final void requestListLocation(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListLocation) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationResult>> getListLocationResult() {
        return null;
    }
    
    public final void requestListUtensils(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestListUtensils) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsResult>> getListUtensilsResult() {
        return null;
    }
    
    public final void saveListLocationToLocal(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.local.room.SaveListLocationLocal saveListLocationLocal, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<brite.outdoor.data.api_entities.response.ResponseListLocation.LocationData> list) {
    }
    
    public final void saveLocationEntity(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.local.room.SaveListLocationLocal saveListLocationLocal, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.LocationEntityConvert location) {
    }
    
    public final void saveListUtensilsToLocal(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.local.room.SaveListUtensilsLocal saveListUtensilsLocal, @org.jetbrains.annotations.NotNull()
    java.util.List<brite.outdoor.data.api_entities.response.ResponseListUtensils.UtensilsData> list) {
    }
    
    public final void saveUtensilEntity(@org.jetbrains.annotations.NotNull()
    brite.outdoor.data.local.room.SaveListUtensilsLocal saveListUtensilsLocal, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.entities.UtensilEntityConvert utensils) {
    }
    
    public final boolean isHaveLocalDataSelectPlace() {
        return false;
    }
    
    public final void setHaveLocalDataSelectPlace(boolean p0) {
    }
    
    public final void getPostSelectPlaceContentInDB(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final boolean isHaveLocalDataSelectUtensils() {
        return false;
    }
    
    public final void setHaveLocalDataSelectUtensils(boolean p0) {
    }
    
    public final void getPostSelectUtensilsContentInDB(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final int getPostIdShareAndLike() {
        return 0;
    }
    
    public final void setPostIdShareAndLike(int p0) {
    }
    
    public final int getPositionPostShareAndLike() {
        return 0;
    }
    
    public final void setPositionPostShareAndLike(int p0) {
    }
    
    public final int getCurrentFragmentPostShareAndLike() {
        return 0;
    }
    
    public final void setCurrentFragmentPostShareAndLike(int p0) {
    }
    
    public final void positionPostShareAndLikeNeedNotifyChange(@org.jetbrains.annotations.Nullable()
    java.lang.Integer postIdShareAndLikeParam, int positionPostShareAndLikeParam, int currentFragmentParam) {
    }
    
    public final void requestPostShare(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestPostShare) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseShares.SharesResult>> getPostShareResult() {
        return null;
    }
    
    public final void requestPostHotNewsShare(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestPostHotNewsShare) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseSharePostHotNews.SharePostHotNewsResult>> getPostHotNewsShareResult() {
        return null;
    }
    
    public final void requestLike(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestLike) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseLike.LikesResult>> getLikeResult() {
        return null;
    }
    
    public final void requestLikePostHotNews(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestLikePostHotNews) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.ResponseLikePostHotNews.LikePostHotNewsResult>> getLikeResultPostHotNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCountNotifyUnread() {
        return null;
    }
    
    public final void setCountNotifyUnread(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    public final void setCountNotifyUnread(int count) {
    }
    
    public final void requestNotifyUnread(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> requestNotifyUnread) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<brite.outdoor.data.remote.ApiResult<brite.outdoor.data.api_entities.response.ResponseNotifyUnread.NotifyUnreadResult>> getNotifyUnreadResult() {
        return null;
    }
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.remote.ApiController apiController, @org.jetbrains.annotations.NotNull()
    brite.outdoor.data.repository.AppRepository appRepository) {
        super();
    }
}